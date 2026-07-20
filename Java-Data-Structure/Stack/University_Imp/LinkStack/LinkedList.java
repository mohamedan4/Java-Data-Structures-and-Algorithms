package LinkStack;

public class LinkedList {
    private Link head;

    public LinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void insetFirst(long data){
        Link newLink = new Link(data);
        newLink.next=head;
        head = newLink;
    }

    public long deleteFirst(){
        Link temp = head;
        head = head.next;
        return temp.data;
    }

    public long displayHead(){
        return head.data;
    }

    public void displayList(){
        Link current = head;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }
}
