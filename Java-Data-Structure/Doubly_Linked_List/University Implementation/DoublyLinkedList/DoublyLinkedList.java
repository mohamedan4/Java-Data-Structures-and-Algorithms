package DoublyLinkedList;

public class DoublyLinkedList {
    private Link head ;
    private Link tail ;
    int size = 0 ;

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void insertHead(long data){
        Link newLink = new Link(data);
        if (isEmpty()){
            tail = newLink;
        }else {
            head.prev = newLink;
        }
            newLink.next = head;
            head = newLink;
        size++;
    }

    public void insetTail(long data){
        Link newLink = new Link(data);
        if (isEmpty()){
            head = newLink;
            size++;
        }else {
            tail.next = newLink;
            newLink.prev = tail;
            size++;
        }
        tail=newLink;
    }

    public Link deleteHead(){
        Link temp = head;
        if (head.next==null){
            temp=null;
            size--;
        }else {
            head.next.prev=null;
            head = head.next;
            size--;
        }
        return temp;
    }

    public Link deleteTail(){
        Link temp = tail;
        if (head.next==null){
            head = null;
            size--;
        }else {
            tail.prev.next=null;
            tail=temp.prev;
            size--;
        }
        return temp;
    }

    public Link deleteKey(long key){
        Link current = head;
        while (current.data!=key){
            current = current.next;
            if (current==null){
                return null;
            }
        }
        if (current == head){
            head = current.next;
            head.prev=null;
            size--;
        }else {
            current.prev.next = current.next;
            size--;
        }
        if (current==tail){
            tail = current.prev;
            tail.next=null;
            size--;
        }else {
            current.next.prev=current.prev;
            size--;
        }
        return current;
    }

    public Link find(long key) {
        Link current = head;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void delete(long d){
        Link current = find(d);
            if (current!=null){
                if (current==head) {
                    head = current.next;
                    current.prev = null;
                    size--;
                }else if (current==tail){
                    tail= current.prev;
                    tail.next=null;
                    size--;
                }
                else {
                    current.prev.next=current.next;
                    current.next.prev=current.prev;
                    size--;
                }
            }
    }

    public void displayForward(){
        System.out.print("Liste: (head-->tail): ");
        Link current = head;
        while (current!=null){
            current.displayList();
            current=current.next;
        }
        System.out.println("");
    }

    public void displayBackward(){
        System.out.print("Liste: (tail-->head): ");
        Link current = tail;
        while (current!=null){
            current.displayList();
            current=current.prev;
        }
        System.out.println("");
    }
}