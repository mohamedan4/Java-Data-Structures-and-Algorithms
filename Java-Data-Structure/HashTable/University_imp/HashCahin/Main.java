package HashCahin;

import DoubleHashing.DataItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int aKey, size, n, keyPerCell = 100;
        Link aDataItem;
        System.out.print("Hash table boyutu: ");
        size = getInt();
        System.out.print("Eklenecek rastgele deger sayisi: ");
        n = getInt();

        HashTable theHashTable = new HashTable(size);

        for (int i = 0; i < n; i++){
            // sayi degeri = 0-100 arasi bir sayi + dizi boyutu
            aKey = (int)(Math.random()*keyPerCell+size);
            //olusturulan rastgele anahtari tasiyan bir nesne olusturulur
            //bu nesne hash tablosunun...
            aDataItem = new Link(aKey);
            //...
            theHashTable.insert(aDataItem);
        }

        while (true){
            System.out.print("Islem secininz: ");
            System.out.print("Goster(g), Ekle(e), Bul(b), Sil(s), Kapat(k)");
            char choice = getChar();
            switch (choice){
                case 'g':
                    theHashTable.displayTable();
                    break;
                case 'e':
                    System.out.print("Eklenecek deger: ");
                    aKey = getInt();
                    aDataItem = new Link(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'b':
                    System.out.print("Aranacak deger: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null){
                        System.out.println("Bulundu: "+ aKey);
                    }else {
                        System.out.println("Bulunamadi "+ aKey);
                    }
                    break;
                case 's':
                    System.out.print("Silinecek deger: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'k':
                    Runtime.getRuntime().exit(0);
                default:
                    System.out.print("Hatali Giris!");
            }
        }


    }

    public static int getInt() throws IOException{
        String i = getString();
        return Integer.parseInt(i);
    }

    public static char getChar()  throws IOException{
        String c = getString();
        return c.charAt(0);
    }

    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine();
        return s;
    }
}
