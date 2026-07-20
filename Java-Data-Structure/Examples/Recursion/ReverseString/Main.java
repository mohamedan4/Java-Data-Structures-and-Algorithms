package Recursion_SumFrom_1_ToAnEnterdNumber;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("bir sayi giriniz:");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        System.out.println("Toplam = "+sum(number));
    }

    static int sum(int number){
        if (number==1){
            return 1;
        }else {
            return number + sum(number-1);
        }
    }
}