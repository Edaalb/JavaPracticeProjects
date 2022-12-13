package practiceQuestions;

public class EmailInfo {

    //Email 2
    //Write a program that will print out information about user based on email.
    // Print first name, last name, and domain.
    // First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
    //Example:
    //```
    //Input: craig_federighi@apple.com
    //```
    //```
    //Output:
    //First name: Craig
    //Last name: Federighi
    //Domain: apple
    
    public static void main(String[] args) {

        String email= "craig_federighi@apple.com";
        String firstName= "";
        String lastName= "";
        String domain= "";

        System.out.println("First name : " + email.substring(0,1).toUpperCase() +
                email.substring(1,5));

        System.out.println("Last name : " + email.substring(6,7).toUpperCase() +
                email.substring(7,15));
        System.out.println("Domain : " + email.substring(16,21));
    }
}
