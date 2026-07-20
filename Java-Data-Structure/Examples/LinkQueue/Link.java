package LinkQueue;

public class Link {
    public int data;
    public Link next;

    public Link(){

    }
    public Link(int data){
        this.data = data;
        next = null;
    }

    // listedeki elemanlari bastiran metot
    public void printData(){
        System.out.println(data);
    }
}
