package HashTable;

public class HashTable {
    private DataItem[] hashArray;

    private int arraySize;
    // Silinen konumu belirtiyor. 5 sayi kumelenmis...

    private DataItem nonItem;

    private int elemnSayisi = 0;

    public HashTable(int size){
        arraySize = size;
        hashArray = new DataItem[arraySize];
        //silinen sayi -1 yapilir, boylece null olmadigi...
        nonItem = new DataItem(-1);
    }

    public void display(){
        System.out.print("Tablo: ");
        for (int i = 0; i < arraySize; i++) {
            if(hashArray[i] != null){
                System.out.print(hashArray[i].getKey() + " ");
            }else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }

    public int hashFunction(int key){
        return key % arraySize;
    }

    public void insert(DataItem item){
        boyutKontrol();
        //eklenecek elemanin key degeri alinir
        int key = item.getKey();
        // alinan key, tablo boyutuna gore bir indis numarasina donusturulur
        // bu islem mod alinarak yapilir
        int hashVal = hashFunction(key);

        // LINEAR PROBING -> +1 +1 seklinde
        // hash tablosunda esaplanan konum dolu mu?
        // konum bos degilse ...
        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){
            // konum, tablo boyutuna gore...
            //
            ++hashVal;
            hashVal %= arraySize;
        }
        // bos yer bulundugunda elemanin eklenmesi
        hashArray[hashVal] = item;
        elemnSayisi++;
    }

    public void boyutKontrol(){
        int hashVal;
        int tempElemanSayisi = 0;
        // REHASHING -> doluysa
        if (elemnSayisi >= (arraySize * 2 / 3)){

            int tempSize = asalGetir(arraySize * 2); // new array size
            // yeni tablo
            DataItem[] tempHash = new DataItem[tempSize];

            for (int i = 0; i < arraySize; i++){ // i = 0

                if (hashArray[i] != null && hashArray[i].getKey() != -1){
                    // yeni tablodaki konum, yeni boyuta gore hash fonksiyonu
                    hashVal = hashArray[i].getKey() % tempSize;
                    //
                    //
                    while (tempHash[hashVal] != null && tempHash[hashVal].getKey() != -1){
                        //
                        ++hashVal;
                        //
                        hashVal %= tempSize;
                    }// end While

                    tempHash[hashVal] = hashArray[i];
                    tempElemanSayisi++;
                }// end if
            }// end for

            // yeni tablo tempHash, artik ana...
            hashArray = tempHash;
            // elemanSayisi guncellendi
            elemnSayisi = tempElemanSayisi;
            // dizi boyutu iki katina en yakin  asal sayi degeri olarak guncellendi
            arraySize = tempSize;
        }/// if rehashing
    }

    private int asalGetir(int min){ // 200
        for (int j = min; true; j++){ //204
            if (asalMi(j)){
                return j;
            }
        }
    }

    private boolean asalMi(int n){
        //
        //
        for (int j = 2; (j*j <= n); j++) {
            //
            if (n % j == 0){
                return false;
            }
        }
        return true;
    }

    public DataItem delete(int key){
        // baslangic konumunu hesapla
        int hashVal = hashFunction(key);
        // aranacak konum dolu oldugu surece
        while (hashArray[hashVal] != null){
            // anahtar bulundu mu?
            if (hashArray[hashVal].getKey() == key){
                // silinecek konum
                // bulunan oge gecici bir degiskende tutulur
                DataItem temp = hashArray[hashVal];
                // konumu nonItem (-1) ile isaretle (silinmis)
                hashArray[hashVal] = nonItem;
                return temp;
            }
            // LINEAR PROBING
            // bir sonraki konuma gec
            ++hashVal;
            // dizinin boyutunu asmamak icin mod al
            hashVal %= arraySize;
        }
        // anahtar bulunmadiysa
        return null;
    }

    public DataItem find(int key){

        int hashVal = hashFunction(key);
        //
        while (hashArray[hashVal] != null){
            //
           if (hashArray[hashVal].getKey() == key){
               return hashArray[hashVal];
           }
            //
            //
            ++hashVal;
            //
            hashVal %= arraySize;
        }
        return null;
    }




}
