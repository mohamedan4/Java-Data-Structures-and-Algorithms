package BinaryTree;

public class Main {
    public static void main(String[] args) {
        Tree theTree = new Tree();

        theTree.insert(50);
        theTree.insert(25);
        theTree.insert(75);
        theTree.insert(12);
        theTree.insert(37);
        theTree.insert(43);
        theTree.insert(30);
//        theTree.insert();
//        theTree.insert();
//        theTree.insert();
//        theTree.insert();
        theTree.insert(97);

//        while (true){
//            System.out.println("Islemi Seciniz:");
//            System.out.println("Goster(g)");
//        }

        theTree.displayTree();
    }
}
