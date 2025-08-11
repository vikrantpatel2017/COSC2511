package Week5;

public class Week5_Lecture {
    public static void main(String[] args) {
        System.out.println("Welcome to Week 5 lecture: ");

        //Let's print 10 numbers using while loop
        System.out.println("The following program prints numbers 1 to 10 using while loop");
        int i = 1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }

        //Let's print 10 numbers using for loop
        System.out.println("The following program prints numbers 1 to 10 using for loop");
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        //Let's print 10 numbers using for do-while loop
        System.out.println("The following program prints numbers 1 to 10 using do-while loop");
        int k = 1;
        do {
            System.out.println(k);
            k++; 
        } while (k<=10);

        System.out.println("This is the end of the program!!");

    }
}
