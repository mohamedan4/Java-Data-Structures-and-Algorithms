import java.util.Scanner;

public class Fibonacci {
    public static long fib(int n){
        if (n==0 || n==1){
            return n;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();

        long startTime = System.currentTimeMillis();
        long result = fib(number);
        long endTime = System.currentTimeMillis();

        double totalTime = (double) (endTime - startTime) / 1000;
        System.out.println("Total time: "+totalTime);
        System.out.println(number + ". Fibonacci number: "+ result);
        reader.close();
    }
}
