package SimpleNumberPrograms;

import java.util.Scanner;

public class EvenorOddUsingIf {
    private static Scanner sc;

    public static void main(String[] args) {
        int Number;
        sc = new Scanner(System.in);
        System.out.println("\n Please Enter Any Integer Value : ");
        Number = sc.nextInt();

        if (Number % 2 == 0) {
            System.out.println("\n You Have Entered Even Number");
        } else {
            System.out.println("\n You Have Entered Odd Number");
        }
    }
}