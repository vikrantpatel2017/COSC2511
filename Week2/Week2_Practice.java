package Week2;

import java.util.Scanner;

public class Week2_Practice {
    public static void main(String[] args) {
        System.out.println("Welcome to Week 2!");

        Scanner input = new Scanner(System.in);

        int total = 0;
        int num1, num2, num3, num4;

        System.out.println("This program ask user to enter four numbers and display the total of all four numbers.");

        System.out.println("Enter the first number: ");
        num1 = input.nextInt();

        System.out.println("Enter the first number: ");
        num2 = input.nextInt();

        System.out.println("Enter the first number: ");
        num3 = input.nextInt();

        System.out.println("Enter the first number: ");
        num4 = input.nextInt();

        total = num1 + num2 + num3 + num4;

        System.out.println("Total of all four numbers = "+total);

        System.out.println("This is the end of this program! Hope you enjoyed the program!!");

    }
}
