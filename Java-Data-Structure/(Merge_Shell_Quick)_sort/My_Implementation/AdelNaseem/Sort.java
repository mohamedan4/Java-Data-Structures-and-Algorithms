package AdelNaseem;

public class Sort {
    private static void Merge(long[] arr, int l, int m, int r){ // l=0 m=0 r=1
        int i,j,k;

        int n1 = m - l + 1;  // 0 - 0 + 1 = n1 = 1
        int n2 = r - m;  // 1 - 0 = n2 = 1
        long[] L = new long[n1]; // n1 = 1
        long[] R = new long[n2]; // n2 = 1

        for (i = 0; i < n1; i++){ // n1 = 1
            L[i]= arr[l+i]; // l = 0  i = 0  = arr[0] => 3
        } // i++
        for (j = 0; j < n2; j++){ // n2 = 1
            R[j] = arr[m+1+j]; // m = 0  j = 0  arr[1] => 7
        } // j++

        i = j = 0;
        k = l; // k = 0

        while(i<n1 && j<n2){ // i=0 n1=1 && j=0 n2=1
            if (L[i]<R[j]){
                arr[k] = L[i++]; // k=l=0
                                 // i=1
            }else {
                arr[k] = R[j++];
            }
            k++; // k=1
        }

        while (i < n1){ // i=1 n1=1
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){ // j=0 n2=1
            arr[k] = R[j]; // k=1
            j++; // j=1
            k++; // k=2
        }
    }

    /* ------------------------------------ MergeSort ------------------------------------------ */

    protected static void MergeSort(long[] arr, int l, int r){ // l : first index = 0  r : last index = arr.length-1
                                            //    l=2    r=3
        if(l<r){
            int m = l + (r-l) / 2; // 2+1 /2 => 3/2=1 m=1

            MergeSort(arr, l, m);
            MergeSort(arr, m+1,r);

            Merge(arr, l, m, r);
        }
    }

    static void print(long[] arr){ // n : is the last index (arr.size-1)
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
