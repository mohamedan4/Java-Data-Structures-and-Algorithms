package LinkedListImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        MyList theList = new MyList();

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);




//        theList.insertHead(50); // bunu ekleyince (50) sıfırıncı oldu
//                                        // bunu ekleyince (50) sıfırıncı olsun
//
//        theList.insertHead(70); // bunu ekleyince (70) sıfırıncı ve (50) birinci oldu
//                                        // bunu ekleyince (50) sıfırıncı ve (70) birinci olsun
//
//        theList.insertHead(90); // bunu ekleyince (90) sıfırıncı, (70) birinci ve (50) ikinci oldu
                                        // bunu ekleyince (50) sıfırıncı, (70) birinci ve (90) ikinci olsun

//        System.out.println("The first element is : "+theList.getHead());
//        System.out.println("The last element is : "+theList.getBack());
//        System.out.println("the size: "+theList.size);
//
//        theList.insertLast(110);
//        System.out.println("The last element is : "+theList.getBack());
//        System.out.println("the size: "+theList.size);
//        System.out.println("the size: "+theList.size);
//        theList.printData();
//
//        theList.insertHead(20);
//        theList.insertHead(40);
//        theList.insertHead(60);
//        theList.insertHead(80);
//        theList.insertHead(100);
//
//        System.out.println("the size: "+theList.size);
//        theList.printData();
//
//        theList.remove(60);
//
//        System.out.println("the size: "+theList.size);
//        theList.printData();
//
//        theList.remove(100);
//        theList.printData();


        theList.insertHead(3);
        theList.printData();

        System.out.println("------");

        theList.insertHead(2);
        theList.printData();

        System.out.println("------");

        theList.insertHead(1);
        theList.printData();

        System.out.println("------");

        System.out.println("The sze of the list is: "+theList.size);

        System.out.println("------");

        theList.deleteFirst();
        theList.printData();

        System.out.println("------");

        theList.insert(2,5);
        theList.printData();

        System.out.println("------");

        theList.remove(5);
        theList.printData();

        theList.insertLast(8);
        theList.printData();
        System.out.println("------");

        System.out.println("The sze of the list is: "+theList.size);

        System.out.println("------");

        theList.deleteLast();
        theList.printData();






    }
}




