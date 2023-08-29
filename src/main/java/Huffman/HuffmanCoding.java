
package Huffman;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HuffmanCoding {
    public static void main(String[] args) {
      
        
        String input = null;
        try{
            File file=new File("D:/semister_5/personstudent.text");
            Scanner inputs=new Scanner(file);
            while(inputs.hasNext()){
                 input=inputs.nextLine();
            }
        }catch(Exception e){
            System.out.println("error");
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
             }

        HuffmanTree huffmanTree = new HuffmanTree(frequencyMap);
        Map<Character, String> encodingMap = huffmanTree.buildEncodingMap();

        String encoded = huffmanTree.encode(input, encodingMap);
        System.out.println("Encoded: " + encoded);

        String decoded = huffmanTree.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}

