package Week4;

import java.util.Scanner;

public class Week4_Practical {

    public static void main(String[] args) {

        System.out.println("Welcome to Week 4 Practical Class: ");

        /* 

        // try {
        // int value1, value2; //initialising variables value 1 and value2
        // Scanner myScanner = new Scanner(System.in); //creating the new instance of
        // the scanner class
        // System.out.println("Hey user! Enter the first number(value1): ");//Printing
        // the statement for user
        // value1 = myScanner.nextInt();//Asking user for the input and storing it in
        // value1
        // System.out.println("Hey user! Enter the second number(value2): ");//
        // value2 = myScanner.nextInt();
        // if (value1 > value2) { //creating the if statement to check if value1 is
        // greater than value2
        // System.out.println(value1 + " is greater than " + value2); //code execution
        // block for first if statement
        // } else if (value2 > value1) { //creating another if statement to check if
        // value2 is greater than value1
        // System.out.println(value2 + " is greater than " + value1); //code execution
        // block for second if statement
        // } else if (value1 == value2) { //creating else statement if all other ifs
        // fail to execute
        // System.out.println(value2 + " is same as " + value1);
        // } else {
        // System.out.println("Something is not right!! check the entire code!!");
        // }

        // } catch (Exception e) {
        // System.out.println("I asked you to enter the number!! You have entered
        // something else!!");
        // }

        // final int MAX = 25, LIMIT = 100;
        // int num1 = 12, num2 = 25, num3 = 87;

        // if (num2 > 18) {
        //     if (num1 < 0) {
        //         System.out.println("apple");
        //     } else {
        //         System.out.println("orange");
        //     }
        // }
        // System.out.println("pear");

        // if (MAX > num3)
        // System.out.println("apple");
        // System.out.println("orange");

        // if (num2 <= MAX){
        // System.out.println("apple");
        // }
        // System.out.println("orange");

        int testscore = 'H'; //72
        char grade;

        char test = 64;

        System.out.println(test+" "+test);

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
*/
    
        Scanner myScanner = new Scanner(System.in);

        int num1;
        String name;

        System.out.println("Hey user!! enter the number: ");
        num1 = myScanner.nextInt();
        System.out.println("You have entered number = "+num1);

        System.out.println("Hey user!! what is your name? ");
        name = myScanner.next();
        System.out.println("You have entered your name = "+name);

        myScanner.close();
}
}