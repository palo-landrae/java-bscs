import java.io.*;
import java.util.Scanner;

public class VowelConsonant {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		char ch;

		System.out.print("Enter an alphabet: ");
		ch = input.next().charAt(0);

		if (!Character.isLetter(ch)){
			System.out.println(String.format("%c is not an alphabet",ch));
			System.exit(0);
		}

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(String.format("%c is vowel",ch));
		else
			System.out.println(String.format("%c is consonant",ch));

		System.exit(0);
	}
}