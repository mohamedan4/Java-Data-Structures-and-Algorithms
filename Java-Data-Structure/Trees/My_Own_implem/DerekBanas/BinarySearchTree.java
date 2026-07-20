package BinsaryTree.DerekBanas;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void addNode(int key, String name){
        Node newNode = new Node(key, name);
        if(root == null){
            root = newNode;
        }else{ // root is not null
            Node focusNode = root;
            Node parent;
            while(true){
                parent = focusNode; // parent pointer will point at the same node focus pointer pointing at
                if(key < focusNode.key){ // if key is less than root it goes left bottom
                    focusNode = focusNode.leftChild; // focus now is on the leftChild while parent is up
                    if(focusNode == null){ // if the left child of the parent is empty
                        // then the left child of the parent will be initialized as the new added node
                        parent.leftChild = newNode;
                        // end while loop
                        return;
                    }
                }else { // else if key is greater than root it goes right bottom
                    focusNode = focusNode.rightChild; // focus now is on the rightChild while parent is up
                    if (focusNode == null){ // if the right child of the parent is empty
                        // then the right child of the parent will be initialized as the new added node
                        parent.rightChild = newNode;
                        // end while loop
                        return;
                    }
                }
            }

        }
    } // end of method

    public boolean remove(int key){
        Node focus = root;
        Node parent = root;

        boolean isItALeftChild = true;

        // loop until focus points at the focus node that we want it to be deleted
        while(focus.key != key){
            parent = focus;
            if (key < focus.key){
                isItALeftChild = true;
                focus = focus.leftChild;
            }else {
                isItALeftChild = false;
                focus = focus.rightChild;
            }
            if (focus == null){
                return false;
            }
        }
        // after founding the focus node that wanted to be deleted
        // focus is pointing at the node will be deleted AND parent pointing at its parent node
        if (focus.leftChild==null && focus.rightChild==null){ // no children || it was a leaf
            if(focus == root){
                root = null;
            }else if(isItALeftChild){
                parent.leftChild = null;
            }else {
                parent.rightChild = null;
            }
        }else if(focus.rightChild==null){ // there is a left child
            if (focus == root){
                root = focus.leftChild;
            }else if (isItALeftChild){
                parent.leftChild = focus.leftChild;
            }else {
                parent.rightChild = focus.leftChild;
            }
        }else if(focus.leftChild==null){ // there is a right child
            if (focus== root){
                root = focus.rightChild;
            }else if(isItALeftChild){
                parent.leftChild = focus.rightChild;
            }else {
                parent.rightChild = focus.rightChild;
            }
        }else { // there are both
            Node replaceMent = getReplaceMentNode(focus);

            if(focus == root){
                root = replaceMent;
            }else if(isItALeftChild){
                parent.leftChild = replaceMent;
            }else {
                parent.rightChild = replaceMent;
            }
            replaceMent.leftChild = focus.leftChild;
            // focus is the up node that we want to delete AND replacement is the node that we will replace the focus node
            // the replacement is a leaf, so it doesn't have a left child, so when we replace it with focus node
            // we have to make replacement node left child equals to the focus left child


        }
        return true;
    }

    public Node getReplaceMentNode(Node replacedNode){
        Node replacementParent = replacedNode;
        Node replacement = replacedNode;

        //focusNode at the last will point at the leaf node that we will replace with the (replacedNode)
        Node focusNode = replacedNode.rightChild;

        // so first we will go one step bottom right

        // then using (while) keep going bottom left till the node focus node is pointing at the leaf node
        while(focusNode != null){ // keep going bottom left till reach the last node the leaf
            replacementParent = replacement;
            replacement = focusNode;
            focusNode = focusNode.leftChild;
        }

        if (replacement != replacedNode.rightChild){
            replacementParent.leftChild = replacement.rightChild;
            replacement.rightChild = replacedNode.rightChild;
        }

        return replacement;
    }

    public void inOrderTraverseTree(Node focus){
        if (focus != null){
            inOrderTraverseTree(focus.leftChild);
            System.out.println(focus);
            inOrderTraverseTree(focus.rightChild);
        }
    }

    public void preOrderTraverseTree(Node focus){
        if (focus != null){
            System.out.println(focus);
            preOrderTraverseTree(focus.leftChild);
            preOrderTraverseTree(focus.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focus){
        if(focus != null){
            postOrderTraverseTree(focus.leftChild);
            postOrderTraverseTree(focus.rightChild);
            System.out.println(focus);
        }
    }

    public Node findNode(int key){
        Node focusNode = root;

        while(focusNode.key != key){
            if (key < focusNode.key){
                focusNode = focusNode.leftChild;
            }else {
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null){
                return focusNode;
            }
        }
        return focusNode;
    }
}
