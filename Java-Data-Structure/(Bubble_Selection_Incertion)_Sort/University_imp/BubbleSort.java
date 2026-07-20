public class BubbleSort1Class{
    public static void main(String[] args) {
        long[] dizi = new long[100];
        int elemanSayisi = 10;
        long temp;

        dizi[0]= 77;
        dizi[1]= 33;
        dizi[2]= 22;
        dizi[3]= 23;
        dizi[4]= 25;
        dizi[5]= 45;
        dizi[6]= 99;
        dizi[7]= 79;
        dizi[8]= 10;
        dizi[9]= 3;

        for (int i=0; i<elemanSayisi ; i++){
            System.out.print(dizi[i]+" ");
        }

        //dizinin sirasiz hali
        System.out.println();

        // Bubble sort algoritmasi
        for(int i=0 ; i<elemanSayisi-1 ; i++){     //
            // icteki dongu elemanlari karsilastirip
            for (int j=0; j<elemanSayisi-i-1; j++){
                //yer degistirme islemi
                if (dizi[j] > dizi[j+1]){
                    temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;
                }
            }
        }
        //dizinin sirali hali
        for (int i=0; i<elemanSayisi; i++){
            System.out.print(dizi[i]+" ");
        }

/*
    long[] dizi2= new int[5];
    int elementsNumber = 10;
    long temp;
        dizi2[0]=15;
        dizi2[1]=5;
        dizi2[2]=25;
        dizi2[3]=45;
        dizi2[4]=35;
       for (long i = 0; i < elementsNumber;i++){
           for (long j = 0; j < elementsNumber-i-1 ; j++){
               if (dizi2[j] > dizi2[j+1]){
                   temp = dizi2[j];
                   dizi2[j] = dizi2[j+1];
                   dizi2[j+1] =temp;
               }
           }
       }
       for (int i = 0 ; i < dizi.length; i++){
           System.out.println(dizi[i]);
       }
 */


    }
}