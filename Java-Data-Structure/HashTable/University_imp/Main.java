import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i =0;
        for (i = 1; i < 8; i+=2) {
            if (i > 4){
                continue;
            }
        }
        System.out.println(i);



//        Scanner giris = new Scanner(System.in);
//        System.out.println(" Birinci sayi giriniz: ");
//        int sayi1 = giris.nextInt();
//        System.out.println(" ikinci sayi giriniz: ");
//        int sayi2 = giris.nextInt();
//        int ebob = ebob(sayi1,sayi2);
//        System.out.println("Iki sayinin ebobu: " + ebob);

//      method(10);
    }
    public static int ebob(int sayi1, int sayi2){
        while (sayi2 != 0){
            int temp = sayi2;
            sayi2 = sayi1 % sayi2;
            sayi1 = temp;
        }
        return sayi1;
    }


//    public static void method(int n){
//        if (n != 4){
//            method(n-1);
//            if (n % 2 == 0){
//                System.out.print(n+" ");
//            }
//        }
//    }
}
