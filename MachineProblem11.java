import java.io.*;
import java.util.Scanner;

public class MachineProblem11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int row, counter = 0;

        System.out.print("Input number of rows: ");
        row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+counter+" ");
            }
            System.out.println();
            counter+=i;
        }

        System.exit(0);
    }
}