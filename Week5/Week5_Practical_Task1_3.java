package Week5;

import java.util.Scanner;

public class Week5_Practical_Task1_3 {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the program which will print numbers from 100 to 1 using do while loop!");

        Scanner myScanner = new Scanner(System.in);

        int runningTotal = 0;
        int temp;

        for (int i = 1; i <= 4 ; i++) {
            System.out.println("Hey user, enter the " + i + "th number: ");
            temp = myScanner.nextInt();
            runningTotal = runningTotal + temp;
            System.out.println("Running total = "+runningTotal);
        }

        System.out.println("Final Toal = "+runningTotal);






    }


}
