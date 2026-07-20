public class IncertionSort {
    public static void main(String[] args) {
        long[] dizi= new long[100];
        int elemanSayisi= 10;

        dizi[0]=11;
        dizi[1]=2;
        dizi[2]=55;
        dizi[3]=35;
        dizi[4]=25;
        dizi[5]=45;
        dizi[6]=33;
        dizi[7]=66;
        dizi[8]=60;
        dizi[9]=7;

        System.out.println("Elemanlar siralanmadan hali");
        for (int i = 0; i < elemanSayisi-1; i++) {
            System.out.print(dizi[i]+" ");
        }
        System.out.println();

        //Incertion sort algoritmasi
        for (int i=1; i<elemanSayisi; i++){
            long temp = dizi[i];
            //diziyi sola kaydirmak icin dongu her basladigimda j = i olarak baslar sirali dizinin son
            //elemanindan baslayarak siralama islemi devam eder
            int j = i;

            //
            while (j>0 && dizi[j-1] > temp){
                dizi[j] = dizi[j-1];
                j--;
            }
            dizi[j] = temp;
        }
        System.out.println("Dizinin siralanmis hali");
        for (int i=0; i <elemanSayisi; i++){
            System.out.print(dizi[i]+" ");
        }
    }
}
