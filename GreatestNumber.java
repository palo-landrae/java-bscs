import java.io.*;
import java.util.Scanner;

public class GreatestNumber {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, max = 0;

		System.out.print("Input the 1st number: ");
		n1 = input.nextInt();
		System.out.print("Input the 2nd number: ");
		n2 = input.nextInt();
		System.out.print("Input the 3rd number: ");
		n3 = input.nextInt();

		if (n1 >= n2 && n1 >= n3)
			max = n1;
		if (n2 >= n1 && n2 >= n3)
			max = n2;
		else
			max = n3;

		System.out.print(String.format("The greatest: %d", max));

		System.exit(0);
	}
}