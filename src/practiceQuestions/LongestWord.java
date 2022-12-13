package practiceQuestions;

public class LongestWord {
    
        //Write a program that will print out the longest word.
        //Note: Assume the length of the two given Strings will be different
        //```
        //input:
        //bill
        //check
        //```
        //```
        //output: check

    public static void main(String[] args) {

        String input1 = "bill";
        String input2 = "check";

        if (input1.length() > input2.length()){

            System.out.print("The longest word is : " + input1);

        } else if (input2.length() > input1.length()) {

            System.out.print("The longest word is : " + input2 );

        }else {

            System.out.println(" The words have the same length ");
        }

    }
}
