package ThaNewBaghdad;

public class Node<T> {
    int key;
    T value;
    Node next;

    public Node(){
        next = null;
    }

    public Node(int key, T value){
        this.key = key;
        this.value = value;
        next = null;
    }

    public int getKey(){
        return key;
    }

    public T getValue(){
        return value;
    }
}
