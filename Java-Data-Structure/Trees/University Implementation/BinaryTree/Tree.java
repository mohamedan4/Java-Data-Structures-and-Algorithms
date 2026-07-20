package BinaryTree;

import java.util.Stack;

public class Tree {
    private Node root;

    public Tree(){
        root = null;
    }

    public void insert(long data){
        Node newNode = new Node(data);
        // veriyi ekleme
        newNode.data = data;
        // agac bossa
        if (root == null){
            root = newNode;
        }else {
            Node current = root;
            Node parent;
            while (true){
                // parent -> su an dikkate alinan konum
                parent = current;
                // deger kokten kucukse sol alt agacta
                if (data < current.data){
                    // current dugumunun sol alt agacina gecilir
                    current = current.leftChild;
                    // sl alt agac bos mu -> sol cocuk yok
                    // yer var -> yeni dugum burada yer almalidir
                    if (current==null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else { // deger kokten buyukse veya esitse sag alt agacta
                    // current dugumunun sag alt agacina gecilir
                    current = current.rightChild;
                    // sag alt agac bos mu -> sag cocuk yok
                    // yer var -> yeni dugum burada yer almalidir
                    if (current == null){
                        // saga ekle
                        parent.rightChild = newNode;
                        return;
                    }
                } // end else
            } // end while
        } // end else
    } // end insert metot

    public Node find(long data){
        // root ile baslanir
        Node current = root;
        // anahtar degerle eslesme yoksa
        while (current.data != data){
            // aranan anliktan
            if (data < current.data){
                current = current.leftChild;
            }else {
                current = current.rightChild;
            }

            // cocuk dugumler yoksa yani bossa
            if (current == null){
                // ssayi bulunmadi
                return null;
            }
        }
        // sayi bulundu
        return current;
    }

    public void traverse(int traverseType){
        switch (traverseType){
            case 1: {
                System.out.println("\n Preorder: ");
                preOrder(root);
            }
            case 2: {
                System.out.println("\n InOrder: ");
                inOrder(root);
            }
            case 3: {
                System.out.println("\n PostOrder: ");
                postOrder(root);
            }
        }
        System.out.println("");
    }

    public void preOrder(Node localRoot){
        if (localRoot != null){
            // root
            System.out.print(localRoot.data + " ");
            // left
            preOrder(localRoot.leftChild);
            // right
            preOrder(localRoot.rightChild);
        }
    }

    public void inOrder(Node localRoot){
        if (localRoot != null){
            // left
            inOrder(localRoot.leftChild);
            // root
            System.out.print(localRoot.data + " ");
            // right
            inOrder(localRoot.rightChild);
        }
    }

    public void postOrder(Node localRoot){
        if (localRoot != null){
            // left
            postOrder(localRoot.leftChild);
            // right
            postOrder(localRoot.rightChild);
            // root
            System.out.print(localRoot.data + " ");
        }
    }

    public Node minimum(){
        // roottan baslanir
        Node current = root;
        Node last = null;
        // sona kadar gidecek
        //sol dal boyunca ilerlenir
        while (current != null){
            // son ziyaret edilen dugumu sakla
            last = current;
            // sol cocuga gec
            current = current.leftChild;
        }
        // en sol dugumdeyiz
        // bu dugum, agacin en kucuk elemani
        return last;
    }

    public boolean delete(long key){
        Node current = root;
        Node parent = root;
        // varsaydik
        boolean isLeftChild = true;
        //---Silincek dugumun konumu bulunuyor----//
        while (current.data != key){
            // silinecek dugumun parent'i
            parent = current;
            // aranan deger current.data'tan kucuk ise sola git
            if (key < current.data){
                //silincek sol cocuk
                isLeftChild = true;
                current = current.leftChild;
            }else {// aranana deger current.data'dan buyuk ya da esit ise saga git
                //silinecek sag cocuk
                isLeftChild = false;
                current = current.rightChild;
            }
            // key is un found
            if (current==null){
                return false;
            }
        }// end while

        // key is found
        if (current.leftChild == null && current.rightChild == null) {
            //silinecek dugumun sag ve sol child dugumleri bossa
            // dugum kokse
            if (current == root) {
                root = null;
            }
            // silinecek sol cocuksa
            else if (isLeftChild) {
                // parent'in sol cocugu silindigi icin null
                // silinecek current=parent.rightChild
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        }else if (current.rightChild == null){  // sol cocuk var
                if (current == root){
                    root = current.leftChild;
                }else if (isLeftChild){
                    parent.leftChild = current.leftChild;
                }else{
                    parent.rightChild = current.leftChild;
                }
        }else if (current.leftChild==null){  // sag cocuk var
                if (current == root){
                    root = current.rightChild;
                }else if(isLeftChild){
                    parent.leftChild = current.rightChild;
                }else{
                    parent.rightChild = current.rightChild;
                }
        }else {
            // iki cocuk var
            //current silinecek dugum, silinecek dugum yerine gececek successor bul....
            // successor, is the node that will be replaced with the node that will be deleted
            Node successor = getSuccessor(current);
            if (current == root){
                root = successor;
            }else if (isLeftChild){ // silinecek parent'in sol cocuguysa
                // parent'in leftChild'ina successor ata
                parent.leftChild= successor;
            }else { // silinecek sag cocuguysa parent'in rightChild'ina successor ata
                parent.rightChild = successor;
            }

            successor.leftChild = current.leftChild;
        }
        return true;
    }

    public Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        // once silinecek dugumun sag cocuguna git
        Node current = delNode.rightChild;

        while (current != null){
            successorParent = successor;
            successor = current;
            // sonra surekli sol cocuga git
            current = current.leftChild;
        } // sol cocuk null olunca dur successor bulundu

        // successor sag alt cocuk degil, sag cocugun sol torunuysa
        if (successor != delNode.rightChild){
            // successor parent sol cocugu, successpr sag cocugu yap
            // leftChild is null, but rightChild could be null or not!!!
            successorParent.leftChild = successor.rightChild;
            // succesoor sag cocugunu, silinecek dugumun sag cocugu yap
            successor.rightChild = delNode.rightChild;
        }
        // if successor == delNode.rightChild
        return successor;
    }

    public void displayTree(){
        //
        Stack<Node> globalStack = new Stack<>();
        //
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("--------------------------------------------------------");
        //
        //
        while (!isRowEmpty){
            //
            Stack<Node> localStack = new Stack<>();
            //
            isRowEmpty = true;

            for (int j=0; j<nBlanks; j++){
                //
                System.out.print(' ');
            }

            while (!globalStack.isEmpty()){
                // globalStack'ten Node Tipinde grtin
                // local stack'ten yerlesenlerden en solda
                Node temp = (Node) globalStack.pop();
                //
                if (temp != null){
                    //
                    System.out.print(temp.data);
                    //
                    localStack.push(temp.leftChild);
                    //
                    localStack.push(temp.rightChild);

                    //
                    if (temp.leftChild != null || temp.rightChild != null){
                        //
                        isRowEmpty = false;
                    }
                }else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                // 32 bosluk vardi sayilar arasi simdi 2 kati oldu
                for (int j = 0; j < nBlanks * 2 - 2; j++){
                    System.out.print(' ');
                }
            }
            System.out.println();
            nBlanks /= 2;
            while (!localStack.isEmpty()){
                //
                //
                globalStack.push(localStack.pop());
                //
            }
        }
        System.out.println("--------------------------------------------------------");
    }
}



// Preorder -> root-lef-right
// Inorder -> left-root-right
// Postorder -> left-right-root








