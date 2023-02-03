import java.io.*;
import java.util.Scanner;

public class MachineProblem12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row;

        System.out.print("Input number of rows: ");
        row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.exit(0);
    }
}