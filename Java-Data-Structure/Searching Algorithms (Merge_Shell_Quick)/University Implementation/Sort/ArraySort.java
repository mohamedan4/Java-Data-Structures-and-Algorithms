package Sort;

public class ArraySort {
    private long[] dizi;

    private int elemanSayisi;

    public ArraySort(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }

    public void insert(long data) {
        dizi[elemanSayisi] = data;
        elemanSayisi++;
    }

    public void display() {
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println("");
    }

    //MERGE SORT
    // siralamayi baslatip kontrol eder
    public void mergeSort() {
        // gecicci dizi
        long[] workSpace = new long[elemanSayisi];
        // alt dizilere parcala
        recMergeSort(workSpace, 0, elemanSayisi - 1);
    }

    // diziyi parcalara bolup her parcayi siralamak
    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) // base case
        {
            // middle accounting
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            // ikisini birlestirme
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    // siralanmis parcalari birlestirip
    // sirali bir yapi olusturacak
    private void merge(long[] workSpace, int lowPTR, int highPTR, int upperBound) {
        // workSpace dizisinin indis degeri
        int i = 0;
        // sol alt dizinin baslangic indisi
        int lowerBound = lowPTR;
        // sol alt dizinin son indisi
        int mid = highPTR - 1;
        // eleman sayisi
        int n = upperBound - lowerBound + 1;

        // her iki alt dizide de eleman kalip kalmadigini bakilir
        // lowPTR <= mid -> sol alt dizide islenmemis eleman var mi
        // highPTR <= upperBound -> sag alt dizide islenmemis eleman var mi
        while (lowPTR <= mid && highPTR <= upperBound) {
            if (dizi[lowPTR] < dizi[highPTR]) {
                // sag alt diziden kucuk eleman alinir
                workSpace[i++] = dizi[lowPTR++];
            } else {
                // sag alt eleman kucuk eleman alinir
                workSpace[i++] = dizi[highPTR++];
            }
        }

        // sol alt dizide kalan elemanlar workSpace'e aktarilir
        // karsilastirmaya ragmen dizinin sol tarafinda eleman kaldiysa
        // birlestirilen diziye aktar
        while (lowPTR <= mid) {
            workSpace[i++] = dizi[lowPTR++];
        }

        // sag alt dizide kalan elemanlar workSpace'e aktarilir
        // karsilastirmaya ragmen dizinin sol tarafinda eleman kaldiysa
        // birlestirilen diziye aktar

        while (highPTR <= upperBound) {
            workSpace[i++] = dizi[highPTR++];
        }

        // workSpace'teki sirali elemanlari ana diziye geri yazilir
        for (i = 0; i < n; i++) {
            dizi[lowerBound + i] = workSpace[i];
        }
    }



    // SHELL SORT
    public void shellSort(){
        int i,j;
        long temp;
        // gap (aralik)
        int h = 1;
        // siralamanin baslangicinda belirli aralik
        // yapilacak siralama icin h hesaplanir
        while (h <= elemanSayisi / 3){
            h = h * 3 + 1;
        }

        // siralama araligini kucukltme
        // h degeri = alana kadar calisir
        // h degeri her siralama adiminda kucultulcek
        while (h>0){
            for (i=h; i < elemanSayisi; i++){
                temp = dizi[i];
                j=i;

                while (j>h-1 && dizi[j-h] >= temp){
                    dizi[j] = dizi[j-h]; // changed
                    j -= h;
                }
                dizi[j] = temp;
            }
            h = (h -1) /3;
        }
    }
}
