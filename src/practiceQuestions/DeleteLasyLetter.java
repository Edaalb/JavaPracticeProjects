package practiceQuestions;

import java.util.Scanner;

public class DeleteLasyLetter {

        //Given a String **txt** print the value without the last letter
        //Ex:
        //```
        //Input:
        //foo
        //```
        //```
        //Output:
        //fo

    public static void main(String[] args) {

        System.out.println("Please enter a word");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println( "Output is : " + input.substring(0,input.length()-1));

    }
}
