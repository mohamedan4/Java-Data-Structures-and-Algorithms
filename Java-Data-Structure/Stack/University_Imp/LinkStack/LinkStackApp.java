package LinkStack;

public class LinkStackApp {
    public static void main(String[] args){
        LinkedStack theList = new LinkedStack();

        theList.push(23);
        theList.push(25);
        theList.push(45);
        theList.push(99);

        theList.displayStack();

        System.out.println(theList.peek());
        theList.pop();
        System.out.println(theList.peek());

    }
}
