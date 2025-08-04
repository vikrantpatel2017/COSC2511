package Week4;

import java.util.Scanner;

public class Lecture_week4 {
    public static void main(String[] args) {
        System.out.println("Welcome to Week 4 lecture: ");

        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.println("Hey user!! Enter the number: ");
            int number1 = myScanner.nextInt();
            System.out.println("You have entered: " + number1);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("We asked you to enter the number but you are stupid!!");
            System.out.println("Next time when you run the program, be smart!!");
        }

    }
}
