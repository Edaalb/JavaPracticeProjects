package practiceQuestions;

public class ReverseString {

    public static void main(String[] args) {
        
        //Write a Java program to reverse a string.
        // Use for loop and create a method called reverseString

        String str= "Ayşe";
        System.out.println(reverseString(str));

    }
    public static String reverseString(String str) {

        String empty = "";

        for (int i = str.length()-1; i >= 0; i--) {

            empty += str.charAt(i);

        }
        return empty;

    }
}
