package practiceQuestions;

import java.util.Scanner;

public class MediumValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the 1st number");
        int no1 = scan.nextInt();

        System.out.println("Please enter the 2nd number");
        int no2 = scan.nextInt();

        System.out.println("Please enter the 3rd number");
        int no3 = scan.nextInt();

        if ((no1 > no2 && no1 < no3) || (no1 > no3 && no1 < no2)) {
            System.out.println("Medium Value is No1");

        }else if ((no2 > no1 && no2 < no3) || (no2 > no3 && no2 < no1 ) ) {
            System.out.println("Medium Value is No2");
        } else
            System.out.println("Medium Value is No3");
    }
}
