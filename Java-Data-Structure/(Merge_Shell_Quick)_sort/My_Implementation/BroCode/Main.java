package BroCode;

public class Main {
    public static void main(String[] args){
        // Merge sort algorithm;
        System.out.println("MERGE SORT");
        int[] arrayMerge = {8,2,5,3,4,7,6,1};

        mergeSort(arrayMerge);
        for(int i : arrayMerge){
            System.out.print(i+ " ");
        }
        System.out.println("\n");

        //  Quick sort algorithm;
        System.out.println("QUICK SORT");
        int[] array = {8,2,5,3,9,4,7,6,1};

        quickSort(array, 0, array.length-1);
        for(int i : array){
            System.out.print(i+ " ");
        }
    }


    /* -------------------------------- Merge sort algorithm --------------------------------------- */
    private static void mergeSort(int[] array ) {
        int length = array .length;
        if(length <= 1) {
            // base case
            return;
        }else {
            int middle = length/2;
            int[] leftArray = new int[middle];
            int[] rightArray = new int[length - middle];

            int i = 0; // left array index
            int j = 0; // left array index

            for(; i<length; i++){
                if(i<middle){
                    leftArray[i] = array[i];
                }else {
                    rightArray[j++] = array[i];
                }
            }

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(leftArray, rightArray, array);
        }
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i=0, l=0, r=0; // i:index of the original array l:index of right array r:index of right array

        while(l<leftSize && r<rightSize ){
            if (leftArray[l]<rightArray[r]){
                array[i++]=leftArray[l++];
            }else {
                array[i++]=rightArray[r++];
            }
        }

        while(l<leftSize){
            array[i++]=leftArray[l++];
        }
        while (r<rightSize){
            array[i++]=rightArray[r++];
        }
    }


    /* -------------------------------- Quick sort algorithm --------------------------------------- */
    private static void quickSort(int[] array, int start, int end){
        // base case
        if (end <= start ){
            return;
        }else {
            int pivot = partition(array, start, end);
            quickSort(array,start,pivot-1);
            quickSort(array,pivot+1,end);
        }
    }

    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end - 1; j++){
            if(array[j] < pivot ){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i; // i : is the location of our pivot.
    }
}
