package ArrayStackDataStructure;

public class Stack {
    static int top;
    static int[] array = new int[100];

    public Stack() {
        top = -1;
    }

    boolean push(int data){
        if (top>=99){
            System.out.println("Stack overflow");
            return false;
        }else {
            array[++top]=data;
            System.out.println(data + "Pushed into the stack");
            return true;
        }
    }

    int pop(){
        if (top < 0){
            System.out.println("Stack underflow");
            return 0;
        }else {
//            int x = array[top--];
            return array[top--];
        }
    }

    boolean isEmpty(){
        return top<0;
    }

    public int peek(){
        return array[top];
    }

    void print(){
        for (int i = top; i>-1; i--){
            System.out.printf(" " + array[i]);
        }
        System.out.println();
    }

    public void clear(){
        top = -1;
    }
}
