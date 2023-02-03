import java.io.*;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number > 0)
            System.out.println("Number is positive");
        else if (number < 0)
            System.out.println("Number is negative");
        else
            System.out.println("Number is neither positive nor negative");

        System.exit(0);
    }
}