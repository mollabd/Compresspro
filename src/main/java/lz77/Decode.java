package lz77;

import java.util.ArrayList;

public class Decode {
	public String decode(ArrayList<triplet> list) {
		
		String ans = "";
		
		for(triplet t:list) {
			//System.out.println(t.getOffset());
			
			int st = ans.length()-t.getOffset();
			int i=st;
			String tmp = "";
			while(i<(st+t.getLen())) {
				ans+=ans.charAt(i);
				i++;
			}
			ans+=t.getNextC();
			
		}
		//System.out.println(ans);
		return ans;
		
	}
}
//cabracadabrarrarrad
//cabracadabrarrarrad