package Week4;

import java.util.Scanner;

public class Week4_Practical {

    public static void main(String[] args) {

        System.out.println("Welcome to Week 4 Practical Class: ");

       try {
           int value1, value2; //initialising variables value 1 and value2
           Scanner myScanner = new Scanner(System.in); //creating the new instance of the scanner class
           System.out.println("Hey user! Enter the first number(value1): ");//Printing the statement for user
           value1 = myScanner.nextInt();//Asking user for the input and storing it in value1
           System.out.println("Hey user! Enter the second number(value2): ");//
           value2 = myScanner.nextInt();
           if (value1 > value2) { //creating the if statement to check if value1 is greater than value2
               System.out.println(value1 + " is greater than " + value2); //code execution block for first if statement
           } else if (value2 > value1) { //creating another if statement to check if value2 is greater than value1
               System.out.println(value2 + " is greater than " + value1); //code execution block for second if statement
           } else if (value1 == value2) { //creating else statement if all other ifs fail to execute
               System.out.println(value2 + " is same as " + value1);
           } else {
               System.out.println("Something is not right!! check the entire code!!");
           }

       } catch (Exception e) {
           System.out.println("I asked you to enter the number!! You have entered something else!!");
       }




    }

}
