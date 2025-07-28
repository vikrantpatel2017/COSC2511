package Week3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator:");

        int num1; //declaring a variable num1 and its return type is integer.

        System.out.println("Hey user!, Enter the first number");

        int num2 = 5;

        Scanner myScanner = new Scanner(System.in);

        num1 = myScanner.nextInt();

        System.out.println("You have entered = "+num1);

        String messageFromUser = myScanner.nextLine();

        System.out.println("Your message is: = "+messageFromUser);


        num2 = myScanner.nextInt();

        System.out.println("You have entered = "+num2);

        System.out.println("Total of num1 and num2 = "+(num1+num2));

    }
}
