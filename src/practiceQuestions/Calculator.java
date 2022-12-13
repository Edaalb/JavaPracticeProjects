package practiceQuestions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //      Let's build a calculator....
        //      Ask the user to choose a calculation mark (+/-/*/).
        //      Ask the user to enter 2 number.
        //      Print out the calculation result on the screen when the user enter second number.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please choose a calculation mark : ");
        char calcutaionMark= scan.next().charAt(0);

        Scanner scan1= new Scanner(System.in);
        System.out.println("Please give 2 numbers : ");
        double number1= scan1.nextInt();
        double number2= scan1.nextInt();

        char addition= '+';
        char substriction= '-';
        char multiplication= '*';
        char division= '/';
        double result= 0;

        if (calcutaionMark == addition) {
        } System.out.println( "Result of the operation : " + (number1 + number2) + ";") ;
        if (calcutaionMark == substriction){
            System.out.println("Result of the operation : " + (number1 - number2) + ";");
        }if (calcutaionMark == multiplication) {
            System.out.println("Result of the operation : " + (number1 * number2) + ";");
        }if (calcutaionMark == division) {
            System.out.println("Result of the operation : " + (number1 / number2) + ";");
        }
        System.out.println("Congratulations");
    }
}
