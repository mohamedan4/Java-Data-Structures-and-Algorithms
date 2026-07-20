package QuickSort;

public class Sort {
    public static void quickSort(int[] array, int start, int end){
        // base case
        if (end <= start ){
            return;
        }else {
            // pivot listenin ortasina yerlesme
            int pivot = partition(array, start, end);
            // pivot listenin orta indisi olunca, iki liseye ayira biliriz
            quickSort(array,start,pivot-1);
            quickSort(array,pivot+1,end);
        }
    }


    private static int partition(int[] array, int start, int end){
        // pivot son indisin degerini alacak
        int pivot = array[end];
        // birinci indis
        int i = start - 1;

        // j : ikinci indis
        for(int j = start; j <= end - 1; j++){
            // j'deki eleman pivot'tan kucukse saga kaydiracagiz
            if(array[j] < pivot ){
                i++;
                // j'deki eleman, pivottan kucuk olan i'e (saga) kaydirma islemi
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // j pivot indisinde olunca i'yi 1 arttirip pivotu j'te kaydiracagiz (sotaya)
        // ondan sinra pivot tam dogru yerine yerlesmis olucak
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        // i : pivot adresidir ya da indisi.
        return i; // i : is the location of our pivot.
    }
}

