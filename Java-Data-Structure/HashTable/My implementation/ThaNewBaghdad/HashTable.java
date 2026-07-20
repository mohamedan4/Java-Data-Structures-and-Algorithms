package ThaNewBaghdad;
// ******** chaining to avoid collision **********

public class HashTable<T> {
    Node[] arrayHash;
    int size;

    public HashTable(int size){
        this.size = size;
        arrayHash = new Node[size];
        for (int i = 0; i < arrayHash.length; i++){
            arrayHash[i] = new Node<T>();
        }
    }

    public int getHash(int key){
        return key%size;
    }

    public void put(int key, T value){
        int index = getHash(key);
        Node arrayValue = arrayHash[index];
        Node newItem = new Node<T>(key, value);
        newItem.next = arrayValue.next;
        arrayValue.next = newItem;
    }

    public T get(int key){
        T value = null;
        int index = getHash(key);
        Node arrayValue = arrayHash[index];
        while (arrayValue!= null){
            if(arrayValue.key == key){
                value = (T) arrayValue.value;
                break;
            }else {
                arrayValue = arrayValue.next;
            }
        }
        return value;
    }

    public int getIndex(int key){
        int index = getHash(key);
        return index;
    }
}
