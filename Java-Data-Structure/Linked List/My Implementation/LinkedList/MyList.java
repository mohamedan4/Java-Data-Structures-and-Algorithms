package LinkedListImplementation;

import java.util.Scanner;

public class MyList {
    public Node head = null;
    public int size = 0;

    Scanner reader = new Scanner(System.in);

    public void insertHead(int insertMe){
        Node temp = new Node(insertMe);
        temp.next = head;
        head = temp;
        size++;
    }

    public void insert(int afterMe, int insertMe){
        Node temp = new Node(insertMe);
        Node current = head;
        while (current.next!=null){
            if (current.data == afterMe){
                temp.next = current.next; // the new node called (temp) will point at the node after current node
                temp.data=insertMe;
                current.next = temp; // the current node will point at the new (temp) node.
                size++; // then the size of the list will be increased one node more so size++
            }else {
                current=current.next;
            }
        }
    }

    public void insertLast(int insertMe){
        Node temp = new Node(insertMe);
        Node current = head;
        while (current.next!=null){
            current=current.next;
        }
        temp.next=null;
        current.next=temp;
        size++;
    }

    public void deleteLast(){
        try {
            if (size==0){
                System.out.println("Exception: Your list is empty!!!");
            }
            Node current = head;
            if (size==1){
                System.out.println("You have only one item"/*, are you sure you want to delete it?"*/);
                /*YesOrNo yesOrNo = YesOrNo.valueOf(reader.next());*/
                head = null;
            }
            while (current.next.next==null){
                current.next=null;
            }
            current=current.next;
            size--;
        }catch (NullPointerException ignored){
        }
    }

    public void remove(int removeMe){
        if (head.next!=null&&head.data==removeMe){
            head=head.next;
            size--;
        }

        Node current = head;
        Node prev = current;
        while (current.next!=null){
            if (current.data==removeMe){
                prev.next=current.next;
                size--;
                break;
            }else {
                prev=current;
                current= current.next;
            }
        }

        if (current.next==null&&current.data==removeMe){
            prev.next=null;
            size--;
        }
    }

    public void deleteFirst(){
        while (head!=null) {
            head = head.next;
            size--;
            break;
        }if (size==0){
            System.out.println("Exception: The list is empty!!!");
        }
    }

    public int getBack(){
        Node current = head;
        while (current.next!=null){
            current=current.next;
        }
        return current.data;
    }

    public int getHead(){
        return head.data;
    }

    public void printData(){
        Node current = head;
        if (head!=null) {
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ": " + current.data);
                current = current.next;
            }
        }else {
            System.out.println("The list is empty!!");
        }
    }

//    public void seaerchElement(int element){
//        Node current = head;
//        while (current.data!=element){
//            current = current.next;
//            if (current.next==null){
//                System.out.println("The element you are searcing about is not in the list");
//            }
//        }
//        System.out.println("The element "+element+" is in the list");
//
//    }
}






