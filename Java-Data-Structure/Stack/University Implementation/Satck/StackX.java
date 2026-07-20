package Satck;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char data){
        stackArray[++top] = data;
    }

    public void pushX(char data){
        if (isEmpty()){
            System.out.println("Stack dolu!!!");
        }else {
            stackArray[++top] = data;
        }
    }

    public char pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }else {
        return stackArray[top--];
        }
    }

    public char peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }else {
        return stackArray[top];
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize-1;
    }

    public void clean(){
        while (top!=-1){
            top--;
        }
    }
}
