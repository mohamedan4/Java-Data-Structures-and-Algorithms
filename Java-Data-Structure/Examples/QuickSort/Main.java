package QuickSort;

public class Main {
    public static void main(String[] args){
        int[] list = {30,20,1,80,10,60,70,50,90,40};

        System.out.println("Listenin siralanmamis hali: ");
        for(int i : list){
            System.out.print(i+ " ");
        }
        System.out.println();

        // QuickSort algoritmasini kullanarak listeyi siraladik
        //parametreler:
        // start: liste 2.birinci indis sifir olan | end: son indis (elemanSayisi-1) olan
        Sort.quickSort(list,0,list.length-1);

        System.out.println("Listenin quickSort kullanarak siralanmis hali: ");
        for(int i : list){
            System.out.print(i+ " ");
        }
    }
}
