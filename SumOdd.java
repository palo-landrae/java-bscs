import java.io.*;

public class SumOdd {
    public static void main(String[] args) {

        int sum = 0;

        System.out.println("The first 10 natural numbers are:");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("\nOdd numbers are:");
        for (int i = 1; i <= 10; i+=2){
            System.out.println(i);
            sum += i;
        }

        System.out.println(String.format("\nThe sum is: %d", sum));
        System.exit(0);
    }
}