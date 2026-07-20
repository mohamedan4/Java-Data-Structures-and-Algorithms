package BinsaryTree.DerekBanas;

public class Main {
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();

        tree.addNode(50, "Boss");
        tree.addNode(25, "Voice manager");
        tree.addNode(15, "Office manager");
        tree.addNode(30, "Secretary");
        tree.addNode(75, "Sales manager");
        tree.addNode(85, "Salesman 1");

        tree.remove(25);
        tree.inOrderTraverseTree(tree.root);


    }
}
