package LinkedListQueue;

public class Node {
    private NodeData data;
    private Node next;

    public Node(NodeData data){
        this.data=data;
        next=null;
    }

    public NodeData getData() {
        return data;
    }

    public void setData(NodeData data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
