package practiceQuestions;

public class HalfPrice {

        // Question 4:
        //Print half twice
        //Write a program that will print out first half of the word twice.
        //Example:
        //```
        //input: java
        //output: jaja
    
    public static void main(String[] args) {
        String input= "javacan";

        System.out.println(input.substring(0,input.length()/2).repeat(2));

    }
}
