package Satck;

public class StackXApp {
    public static void main(String[] args) {
    StackX theStack = new StackX(10);

    theStack.push('s');
    theStack.push('a');
    theStack.push('d');
    theStack.push('a');

        System.out.println(theStack.peek());
    while (!theStack.isEmpty()){
        System.out.println("En ustteki eleman: "+theStack.pop());
    }

    }
}