package Bubble_Selection_Insertion;

public class Main {
    public static void main(String[] args) {
        int[] Array = {7,8,2,5,4};

//        Array[0]=38;
//        Array[1]=22;
//        Array[2]=87;
//        Array[3]=2;
//        Array[4]=90;
//        Array[5]=55;
//        Array[6]=36;
//        Array[7]=4;
//        Array[8]=40;
//        Array[9]=63;

        System.out.println("Selection sort");
        Sort.Selection(Array);
        System.out.println("Insertion sort");
        Sort.Insertion(Array);
        System.out.println("Bubble sort");
        Sort.BubbleSort(Array);
    }
}
