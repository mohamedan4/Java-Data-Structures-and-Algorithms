package Bubble_Selection_Insertion;

public class Sort {

    // Bubble sort method
    public static void BubbleSort(int[] array){
        int temp;
        for(int i=0 ; i< array.length-1 ; i++){
            for (int j=0; j< array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    // Selection sort method
    public static void Selection(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1 ; j < array.length; j++) {
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    // Insertion sort method
    public static void Insertion(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j>0 && array[j-1]>temp){
                array[j]=array[j-1];
                j--;
            }
            array[j]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }



}


