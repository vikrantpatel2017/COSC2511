package Week4;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("Welcome to Task 6:");

        int penalty = 0;
        int demerit_points = 0;
        String automatic_licence_suspension = "";

        System.out.println("Hey user! what is the exceeding speed limit to generate the fine report: ");

        Scanner myScanner = new Scanner(System.in);
        int Exceeding_Speed_Limit = myScanner.nextInt();

        if (Exceeding_Speed_Limit < 10) {
            penalty = 231;
            demerit_points = 1;
            automatic_licence_suspension = "NOT Applicable";
        } else if (Exceeding_Speed_Limit >= 10 && Exceeding_Speed_Limit <= 24) {
            System.out.println("Hey user! Enter the speed zone:");
            int speed_zone = myScanner.nextInt();
            if (speed_zone == 110) {
                penalty = 370;
                demerit_points = 0;
                automatic_licence_suspension = "3 Months";

            } else {
                penalty = 370;
                demerit_points = 3;
                automatic_licence_suspension = "NOT Applicable";
            }
        } else if (Exceeding_Speed_Limit >= 25 && Exceeding_Speed_Limit <= 29) {
            penalty = 509;
            demerit_points = 0;
            automatic_licence_suspension = "3 Months";
        } else if (Exceeding_Speed_Limit >= 30 && Exceeding_Speed_Limit <= 34) {
            penalty = 501;
            demerit_points = 0;
            automatic_licence_suspension = "3 Months";
        } else if (Exceeding_Speed_Limit >= 35 && Exceeding_Speed_Limit <= 39) {
            penalty = 693;
            demerit_points = 0;
            automatic_licence_suspension = "6 Months";
        } else if (Exceeding_Speed_Limit >= 40 && Exceeding_Speed_Limit <= 44) {
            penalty = 786;
            demerit_points = 0;
            automatic_licence_suspension = "6 Months";
        } else if (Exceeding_Speed_Limit >= 45) {
            penalty = 925;
            demerit_points = 0;
            automatic_licence_suspension = "12 Months";
        } else {

        }


        System.out.println("========================================================================================================");
        System.out.println("========================================================================================================");
        System.out.println("Here is the report which you can send to the offender: ");
        System.out.println("You have violated the road safety rules by Victorian Government and here is details of your penalty, demerit points and licence suspension if applicable: ");
        System.out.println("Applicable Penalty = "+penalty+"AUD");
        System.out.println("Applicable Demerit points = "+demerit_points);
        System.out.println("Applicable automatic Licence Suspension period = "+automatic_licence_suspension);
        System.out.println("Kindly submit the fine and read the attached pdf file.");
        System.out.println("========================================================================================================");


    }

}
