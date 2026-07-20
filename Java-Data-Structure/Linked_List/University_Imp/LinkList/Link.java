package LinkList;

public class Link {
    public long data;
    public Link next;

    public Link(long d) {
        data = d;
    }

    // Verileri ekrana listeleme
    public void displayLink(){
        System.out.print(data+" ");
    }
}
