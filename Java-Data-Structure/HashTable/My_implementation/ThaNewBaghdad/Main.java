package ThaNewBaghdad;

public class Main {
    public static void main(String[] args){
        HashTable<String> hashTable = new HashTable<String>(6);

        hashTable.put(0,"Mohammed");  // index = 0
        hashTable.put(1,"Mariam");  // index = 1
        hashTable.put(2,"Khalid");  // index = 2
        hashTable.put(3,"Ali");  // index = 3
        hashTable.put(4,"Norah");  // index = 4
        hashTable.put(5,"Yasmin");  // index = 5
        hashTable.put(6,"Saad");  // index = 0
        hashTable.put(7,"Ibrahim");  // index = 1
        hashTable.put(8,"Muna");  // index = 2
        hashTable.put(9,"Yahya"); // index = 3
        hashTable.put(10,"Mustafa"); // index = 4
        hashTable.put(11,"Osama"); // index = 5
        hashTable.put(12,"Abdullah"); // index = 0
        hashTable.put(13,"Joe"); // index = 1
        hashTable.put(14,"Derek"); // index = 2

        System.out.println(hashTable.get(13));
        System.out.println(hashTable.getIndex(14));

    }
}
