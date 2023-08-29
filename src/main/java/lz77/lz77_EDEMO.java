package lz77;

import java.util.ArrayList;
import java.util.Scanner;
// c a b r a c a d a b r a r r a r r a d
//cabracadabrarrarrad


public class lz77_EDEMO {
	
	public static void main(String args[]) {
		
            System.out.println("enter the input text");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		Encode encode = new Encode();
		
		ArrayList<triplet> encodeList = encode.doEncode(input);
		
		Decode decode = new Decode();
                
		String decoded=decode.decode(encodeList);
                
                for(int i=0; i<decoded.length(); i++){
                    if(decoded.charAt(i)!='*')System.out.print(decoded.charAt(i));
                }
                   
                
		
		
	}
	
}
