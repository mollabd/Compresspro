package lz77;

import java.util.ArrayList;

public class Encode {
	private final static int wSize = 13;
	ArrayList<triplet> encodeList = new ArrayList<>();
	
	private static int findLen(int in_i, int sb_i , String input) {
		        // TODO Auto-generated method stub
		int len = 0, limit = (wSize+1)/2;
		while(len<limit &&len< input.length() && input.charAt(sb_i)==input.charAt(in_i)) {
			len++;
			sb_i++; in_i++;
		}
		return len;
	}
	
	
	
	ArrayList<triplet> doEncode(String input){
		int len = input.length();
		input+="*";
		String sb="";
                    //encodeList.add(new triplet(0,0,input.charAt(0)));
		int i = 0;
		while(i<len) {
			char c = input.charAt(i);
			
			int mxLen = 0, offset = 0; char nextC = '*';
			
			for(int j=Math.max(0,sb.length()-wSize/2-1);j<sb.length();j++) {
				if(sb.charAt(j)==c) {
					int newLen = findLen(i,j,input);
					if(newLen>=mxLen) {
						mxLen = newLen;
						offset = sb.length()-j;
					}
				}
			}
			
			int j = 0;
			while(j<=mxLen) {
				sb+=input.charAt(i++);
				j++;
			}
			nextC = input.charAt(i-1);
			encodeList.add(new triplet(offset,mxLen,nextC));
                        //System.out.println(i-1+" "+sb);
		}
                   //System.out.println(encodeList.size());
		
		for(triplet t:encodeList){
                    if(t.getNextC() !='*')
                        System.out.println(t);
                }
                
		
		return encodeList;
	}
}
