package DoublyLinkedList;

public class Link{
    public long data;
    public Link next;
    public Link prev;

    public Link(long data) {
        this.data = data;
    }

    public void displayList(){
        System.out.print(data+" ");
    }
}
