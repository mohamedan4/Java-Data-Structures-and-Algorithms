package LinkStack;

public class Link {
    public long data;
    Link next;

    public Link(long data){
        this.data=data;
    }

    public void displayLink(){
        System.out.print(data+" ");
    }
}
