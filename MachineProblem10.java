import java.io.*;

public class MachineProblem10 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+counter+" ");
            }
            System.out.println();
            counter+=i;
        }

        System.exit(0);
    }
}