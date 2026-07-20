package StudentSingleLinkedList_MyImplementation;

public class Main {
    public static void main(String[] args) {
        StudentsLinkedList studentsList = new StudentsLinkedList();
        studentsList.insertHead("Arda",31,"20221233");
        studentsList.insertHead("Mohamed",22,"20231234");
        studentsList.insertHead("John",16,"20251235");
        studentsList.insertHead("Sarah",19,"20321233");

        studentsList.printStudentsData();

        studentsList.deleteHead();
        System.out.println();
        studentsList.printStudentsData();

        System.out.println();
        studentsList.deleteLast();
        studentsList.printStudentsData();
    }
}
