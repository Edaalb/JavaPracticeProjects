package practiceQuestions;

import java.util.Scanner;

public class Alejandro {

    //Alejandro
    //Alejandro has many emails and only has time to read the emails that refer to him.
    // Check if his name is found in the email and if it does print "read", but if his name is not in the email print "don't read"
    //Examples:
    //```
    //a = "dear alejandro.....alot of text"
    //output: "read"
    //```
    //```
    //a = "thunder blaz is the best drink in the galaxy..."
    //output: "don't read"
    //```
    //```
    //a = "subject : important project, alejandro we refer to you  this ...."
    //output: "read"

    public static void main(String[] args) {

        System.out.println("Please write your e-mail here : ");
        Scanner scan= new Scanner(System.in);

        String email= scan.nextLine();

        String name= "Alejandro";
        String copyName= name.toLowerCase();

        if (email.contains(name) || (email.contains(copyName))) {
            System.out.println("Read");
        }else
            System.out.println("Unread");
    }
}
