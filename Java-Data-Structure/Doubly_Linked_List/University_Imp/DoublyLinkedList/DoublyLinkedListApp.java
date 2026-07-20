package DoublyLinkedList;

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertHead(22);
        theList.insertHead(44);
        theList.insertHead(66);

        theList.insetTail(11);
        theList.insetTail(33);
        theList.insetTail(55);

        theList.displayForward();
        theList.displayBackward();

        theList.deleteHead();
        System.out.print("Bastan eleman silindi ");
        theList.displayForward();

        theList.delete(11);
        System.out.print("eleman silindi ");
        theList.displayBackward();

    }
}
