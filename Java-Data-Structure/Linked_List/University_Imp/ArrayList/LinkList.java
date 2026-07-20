package ArrayList;

public class LinkList {
    private Link head;

    public LinkList() {
        head = null;
    }

    // Listenin basina eleman ekle
    public void insertToHead(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = head;
        head = newLink;
    }

    // Eleman silme
    public Link deleteFirst(){
        Link temp = head;
        head = head.next;
        return temp;
    }

    //Verileri ekrana bastirmak
    public void displayList(){
        System.out.println("Liste");
        Link current = head;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    // Liste bos olup olamdigini kontrolu
    public boolean isEmpty(){
        return (head == null);
    }

}
