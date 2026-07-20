package Sort;

public class Main {
    public static void main(String[] args) {
        ArraySort dizi = new ArraySort(6);
        dizi.insert(50);
        dizi.insert(20);
        dizi.insert(2);
        dizi.insert(15);
        dizi.insert(40);
        dizi.insert(30);
        System.out.println("Dizinin siralanmamis hali: ");
        dizi.display();

        dizi.mergeSort();

        System.out.println("Dizinin siralanmis hali: ");
        dizi.display();
    }
}

// reverseOf user enters a word and my method reverses it (Assignment)