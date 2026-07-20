package DoubleHashing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataItem aDataItem;
        int key, size, n, keysPerCell;

        System.out.print("Hash Table boyutnu giriniz: ");
        size = getInt();
        System.out.print("Rastgele eklenecek veri miktarini giriniz: ");
        n = getInt();

        keysPerCell = 100;

        HashTable theHashTable = new HashTable(size);

        for (int i =0; i < n; i++){

            key = (int)(java.lang.Math.random()*keysPerCell+size);

            aDataItem = new DataItem(key);

            theHashTable.insert(aDataItem);
        }

        while (true){
            System.out.print("Islem secininz: ");
            System.out.print("Goster(g), Ekle(e), Bul(b), Sil(s), Kapat(k)");
            int choice = getChar();
            switch (choice){
                case 'g':
                    theHashTable.displayTable();
                    break;
                case 'e':
                    System.out.print("Eklenecek deger: ");
                    int value = getInt();
                    aDataItem = new DataItem(value);
                    theHashTable.insert(aDataItem);
                    break;
                case 'b':
                    System.out.print("Aranacak deger: ");
                    value = getInt();
                    DataItem found = theHashTable.find(value);
                    if (found != null){
                        System.out.println("Bulundu: "+ value);
                    }else {
                        System.out.println("Bulunamadi");
                    }
                    break;
                case 's':
                    System.out.print("Silinecek deger: ");
                    value = getInt();
                    DataItem didDelete = theHashTable.delete(value);
                    if (didDelete != null){
                        System.out.print("Silindi: "+value);
                    }else {
                        System.out.print("Silinemedi!");
                    }
                    break;
                case 'k':
                    Runtime.getRuntime().exit(0);
                default:
                    System.out.println("Hatali Giris!");
            }
        }
    }

    public static int getInt(){
        String i = getString();
        return Integer.parseInt(i);
    }

    public static char getChar(){
        String c = getString();
        return c.charAt(0);
    }

    public static String getString(){
        Scanner reader = new Scanner(System.in);
        String s = reader.next();
        return s;
    }
}
