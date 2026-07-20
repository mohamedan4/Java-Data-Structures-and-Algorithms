package StudentSingleLinkedList_MyImplementation;

public class Student {
    private String name;
    private int age;
    private String id;
    private Student next;

    public Student(String name, int age, String id){
        next = null;
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public void printAllStudentData(){
        System.out.println("Name: " + name + " age: " + age + " id: " + id);
    }

    public boolean equalTo(Student afterMe) {
        return name.equals(afterMe.getName())
                &&  age == afterMe.getAge()
                &&  id.equals(afterMe.getId());

    }


}
