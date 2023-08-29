
package LZW;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LZWTest {
    public static void main(String[] args) {
        String inputs = null;
       try{
           File file=new File("D:/semister_5/personstudent.text");
           Scanner input=new Scanner(file);
           while(input.hasNext()){
                inputs=input.nextLine();
           }
       }catch(Exception e){
           System.out.println("error");
        }
       
        
       LZWEncoder encoder = new LZWEncoder();
       List<Integer> compressed = encoder.compress(inputs);
       System.out.println("Compressed: " + compressed);
        
        LZWDecoder decoder = new LZWDecoder();
        List<Integer>compresed = new ArrayList<>();
       
        String decompressed = decoder.decompress(compresed);
        System.out.println("Decompressed: " + decompressed);
    }
}


