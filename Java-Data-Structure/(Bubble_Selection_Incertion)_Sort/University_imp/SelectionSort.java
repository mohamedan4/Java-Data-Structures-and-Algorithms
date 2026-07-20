public class SelectionSort {
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

        // selection sort algoritmasi
        //distaki dongu siralanacak elemanlari temsil eder
        for (int i = 0; i<elemanSayisi-1; i++) {
            int minIndex = i ;
            //siralanmamis kismi tarayacak
            for (int j=i+1; j<elemanSayisi; j++){
                if (dizi[j] < dizi[minIndex]){
                    //daha kucuk elemani bulduysan tut
                    minIndex = j;
                }
            }
            //kucuk deger bulduysan deigstir
            if (minIndex != i ) {
                long temp = dizi[i];
                dizi[i] = dizi[minIndex];
                dizi[minIndex]=temp;
            }
        }
        System.out.println("Dizinin siralanmis hali");
        for (int i=0; i <elemanSayisi; i++){
            System.out.print(dizi[i]+" ");
        }
    }
}
