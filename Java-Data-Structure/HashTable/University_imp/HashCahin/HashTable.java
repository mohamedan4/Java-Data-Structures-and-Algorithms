package HashCahin;

public class HashTable {
    private SortedList[] hashArray;

    private int arraySize;

    public HashTable(int size){
        arraySize = size;
        hashArray = new SortedList[arraySize];
        for (int j = 0 ; j < arraySize ; j++){
            hashArray[j] = new SortedList();
        }
    }

    public void displayTable(){
        for (int i = 0; i < arraySize; i++){
            System.out.print(i + ", ");
            hashArray[i].displayList();
        }
    }

    public int hashFunction(int key){
        return key % arraySize;
    }

    public void insert(Link theLink){
        int key = theLink.getKey();
        int hashValue = hashFunction(key);

        hashArray[hashValue].insert(theLink);

    }

    public void delete(int key){
        int hashValue = hashFunction(key);
        hashArray[hashValue].delete(key);
    }

    public Link find(int key){
        int hashValue = hashFunction(key);
        Link theLink = hashArray[hashValue].find(key);
        return theLink;
    }


}
