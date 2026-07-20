package LinkQueue;

import java.util.Stack;

public class LinkList {
    public Link head;
    public Link tail;
    int elemanSayisi;

    public LinkList(){
        head=null;
        elemanSayisi=0;
    }

    public boolean isEmpty(){
        return elemanSayisi==0;
    }

    // enQueue yerine gelen metot
    public void insertHead(int data){
        Link newLink = new Link(data);
        if (isEmpty()){
            tail=newLink;
        }
        newLink.next=head;
        head=newLink;
        elemanSayisi++;
    }

    // deQueue yerine gelen metot
    public void deleteLast(){
        if (isEmpty()){
            System.out.println("Liste bos!!");
            return;
        }else if (head==tail){
            System.out.println(tail+" silindi");
            tail = head = null;
        }
        Link current = new Link();
        Link previous = new Link();
        current = head;
        previous = current;

        while (current.next!=null){
            previous = current;
            current = current.next;
        }
        System.out.println(tail.data+" silindi");
        tail=previous;
        tail.next=null;
        elemanSayisi--;
    }

    // elemanlari ekrana basan metot
    public void print(){
        if (isEmpty()) {
            System.out.println("Liste bos!!");
            return;
        }
        Link current = head;
        // bir stack olusturdum
        Stack<Link> stack = new Stack<>();

        // tum elemanlari head'ten tail'e kadar stack icine bastim push(); kullanarak
        while (current!=null){
            stack.push(current);
            current = current.next;
        }

        // pop(); kullanarak ekrana bastim ki ters ekrana basilsin,
        // Cunku linkedList ilk giren eleman tail olur,
        // o yuzden ekrana bastirinca son giren ilk cikacak ve Queue algoritmasinda ilk giren ilk cikar
        while (!stack.isEmpty()){
            stack.pop().printData();
        }
    }
}
