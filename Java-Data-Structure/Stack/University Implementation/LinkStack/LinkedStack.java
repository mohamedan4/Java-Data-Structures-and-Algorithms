package LinkStack;

public class LinkedStack {
    private LinkedList theList;

    public LinkedStack() {
        theList = new LinkedList();
    }

    public void push(long data){
        theList.insetFirst(data);
    }

    public long pop(){
        return theList.deleteFirst();
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void displayStack(){
        System.out.println("Stack (top --> bottom)");
        theList.displayList();
        System.out.println("");
    }

    public long peek(){
        return theList.displayHead();
    }


}
