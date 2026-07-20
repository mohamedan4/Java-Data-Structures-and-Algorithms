package LinkedListStackDataStructure;

public class StackApp {
    StackNode root;

    public void push(int data){
        StackNode newNode = new StackNode(data);
        if (root == null){
            root = newNode;
        }else{
            StackNode temp;
            temp = root;
            root = newNode;
            newNode.next = temp;
        }
    }

    int pop(){
        return 4;
    }

    boolean isEmpty(){
        return root==null;
    }
}
