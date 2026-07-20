package Queue;

public class Queue {
    // eleman sayisi
    int size;
    // front ilk girilen elemanin indisi | rear son girilen elemanin indisi
    int front,rear;
    int[] queue;

    public Queue(int size){
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // listenin bos olup olmadigini kontrol eden metot
    public boolean isEmpty(){
        if (rear==-1){
            return true;
        }else {
            return false;
        }
    }

    // listenin dolu olup olmadigini kontrol eden metot
    public boolean isFull(){
        if ( (rear==size-1 && front==0) || (front==rear+1) ){
            return true;
        }else {
            return false;
        }
    }

    // eleman eklemek metotdu
    public void enQueue(int data){
        // liste doluysa eleman ekleyemezsin
        if (isFull()){
            System.out.println("Liste dolu! eleman ekleyemezsiniz");
        }else if (isEmpty()){
            // liste bossa front'u ve rear'i 1 arttiracagiz
            front = 0;
            rear = 0;
            queue[rear]=data;
            System.out.println(data+" eklendi");
        }else {
            // liste bos ya da dolu degilse sadece rear'i arttiracagiz
            rear = (rear+1) % size;
            queue[rear]=data;
            System.out.println(data+" eklendi");
        }
    }

    // ilk giren elemani silip geri ekrana basar
    public void deQueue(){
        // liste bossa eleman silinmez
        if (isEmpty()){
            System.out.println("Liste bos!!");
        }else if (rear == front){
            System.out.println(queue[front]+": silindi");
            front=-1;
            rear=-1;
        }else {
            System.out.println(queue[front]+": silindi");
            front = (front+1) % size;
        }
    }

    public void print(){
        // liste bossa
        if (isEmpty()){
            System.out.println("Liste bos!!");
        }else if(rear == front){
            // listede sadece bir eleman varsa
            System.out.println("Listede sadece bir eleman vardir: "+queue[rear]);
        }else if (rear == front+1){
            // listede sadece iki eleman varsa
            System.out.println("Lsitede sadece iki eleman vardir: "+queue[front]+" "+queue[rear]);
        }else {
            for(int i = front; i != rear; i = (i+1)%size){
                System.out.println(queue[i]);
            }
            System.out.println(queue[rear]);
        }
    }
}
