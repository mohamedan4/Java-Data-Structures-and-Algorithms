package BinaryTree;

public class Node {
    public long data;
    public Node leftChild,rightChild;

    public Node(long data){
        this.data = data;
    }

    public void displayNode(){
        System.out.println("{" + data + "}");
    }
}
