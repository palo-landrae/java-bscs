import java.io.*;
import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String[] week = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println(week[number - 1]);

        System.exit(0);
    }
}