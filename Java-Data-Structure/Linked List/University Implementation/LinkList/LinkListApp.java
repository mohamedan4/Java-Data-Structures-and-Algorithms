package LinkList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertToHead(22);
        theList.insertToHead(44);
        theList.insertToHead(66);

        theList.insertToHead(11);
        theList.insertToHead(33);
        theList.insertToHead(55);

        theList.displayList();

        theList.deleteFromHead();
        theList.deleteFromHead();

        theList.displayList();
    }
}
