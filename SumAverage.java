import java.io.*;

public class SumAverage {
    public static void main(String[] args) {

        int sum = 0;

        System.out.println("The first 15 natural numbers are:\n");

        for (int i = 1; i <= 15; i++){
            System.out.println(i);
            sum += i;
        }

        System.out.println(String.format("The sum is: %d", sum));
        System.out.println(String.format("The average is: %d", sum/15));
        System.exit(0);
    }
}