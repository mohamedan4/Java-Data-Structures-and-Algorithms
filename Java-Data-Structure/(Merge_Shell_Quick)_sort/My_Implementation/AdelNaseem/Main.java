package AdelNaseem;

public class Main {
     public static void main(String[] args) {
        long[] arr = {60,10,20,5,60,70};
        Sort.MergeSort(arr,0,arr.length-1);
        Sort.print(arr);
    }
}