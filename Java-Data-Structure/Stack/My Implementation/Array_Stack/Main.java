package ArrayStackDataStructure;

public class Main {
    public static void main(String[] args) {
        int[] f = new int[5];
        System.out.println(f[4]);
        Stack s = new Stack();
        s.push(22);
        s.push(30);
        s.push(80);


        System.out.printf("Elements present in stack:");
        s.print();
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.printf("Elements present in stack: ");
        s.print();
    }
}