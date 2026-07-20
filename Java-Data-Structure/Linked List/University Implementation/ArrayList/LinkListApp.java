package ArrayList;

import java.util.ArrayList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertToHead(1,11.1);
        theList.insertToHead(2,2.3);
        theList.insertToHead(3,3.4);
        theList.insertToHead(4,4.5);
        theList.insertToHead(5,5.6);

        // Elemanlari listeleme
        theList.displayList();

        // Elemanlari silme
        while (!theList.isEmpty()){
            Link aLink = theList.deleteFirst();
            System.out.println("Silinen: ");
            aLink.displayLink();
            System.out.println("");
        }

        //Listenin son halini ekrana bastirma

        theList.displayList();
    }
}
