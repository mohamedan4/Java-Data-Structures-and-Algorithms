package StudentSingleLinkedList_MyImplementation;

import java.util.Stack;

public class StudentsLinkedList {
    Student head ;
    int size ;

    public StudentsLinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head==null&&size==0;
    }

    public void insertHead(String name, int age, String id){
        Student newStudent = new Student(name, age, id);
        newStudent.setNext(head);
        head=newStudent;
        size++;
    }

    public void insert(/*after this*/String name1, int age1, String id1,/*insert this*/ String name2, int age2,String id2){
        Student newStudent = new Student(name2,age2,id2);
        Student afterMe = new Student(name1,age1,id1);
        Student current = head;
        while(current.getNext()!=null){
            if( current.equalTo(afterMe) ) {
                newStudent.setNext(current.getNext());
                current.setNext(newStudent);
                size++;
            }else{
                current=current.getNext();
            }
        }
    }

    public void insertLast(String name,int age, String id){
        Student newStudent = new Student(name, age, id);
        Student current = head;
        while (current.getNext()!=null) {
            current = current.getNext();
        }
        newStudent.setNext(null);
        current.setNext(newStudent);
        size++;
    }

    public void deleteHead(){
        if (isEmpty()){
            System.out.println("List is empty!!!");
        }else{
            head=head.getNext();
            size--;
        }
    }

    public void delete(String name, int age, String id){
        Student deleteMe = new Student(name, age, id);
        Student current = head;
        Student prev = current;
        while(current.getNext()!=null){
            if (current.equalTo(deleteMe)){
                prev.setNext(current.getNext());
                size--;
                break;
            }else {
                prev=current;
                current=current.getNext();
            }
        }
    }

    public void deleteLast(){
        Student current =head;
        Student prev = current;
        while (current.getNext()!=null){
            prev = current;
            current = current.getNext();
        }
        prev.setNext(null);
        size--;
    }

    public void printStudentsData0(){
        Student current = head;
        if(isEmpty()){
            System.out.println("The list is empty!");
        }else {
            for (int i = 0; i < size; i++) {
                System.out.print((i+1)+": ");
                current.printAllStudentData();
                current = current.getNext();
            }
        }
    }

        public void printStudentsData(){
        Student current = head;
            if(isEmpty()){
            System.out.println("The list is empty!");
            }else {
                Stack<Student> stack = new Stack<>();

                while (current!=null){
                    stack.push(current);
                    current=current.getNext();
                }
                while (!stack.isEmpty()){
                    stack.pop().printAllStudentData();
                }
            }
        }

//    public void printStudentsDataSorted(){
//        Student current = head;
//        if(isEmpty()){
//            System.out.println("The list is empty!");
//        }else {
//            while (current.getNext()!=null){
//                current = current.getNext();
//            }
////            System.out.print(1+": ");
//            current.printAllStudentData();
//            Student displayed = current;
//            if (head.getNext()!=displayed){
//                while (current.getNext()!=displayed){
//                    current = current.getNext();
//                }
//                current.printAllStudentData();
//            }
//            head.printAllStudentData();
//
//
//            /*
//            for (int i = 0; i < size; i++) {
//                System.out.print((i+1)+": ");
//                current.printAllStudentData();
//                current = current.getNext();
//            } */
//        }
//    }


}
