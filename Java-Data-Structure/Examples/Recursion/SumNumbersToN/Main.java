package Recursion_ReversingAnEnteredString;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Metin Giriniz:");
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        System.out.println(reverseWord(word));
    }

    static String reverseWord(String word){
        String result;
        int i =0;
        if (word.isEmpty()){
            return word;
        }else {
            return word.charAt(word.length()-1) + reverseWord(word.substring(0,word.length()-1));
        }
    }
}
