package practiceQuestions;

public class CountCharachter {

    public static void main(String[] args) {

        //Create a method which has String parameter
        //This method will count the number of String character.
        //Tip>>> You should use loop in the method

        String input= "Ali and Elif";
        System.out.println("Number of Characters : "); // 12
        System.out.println(numberOfTheCharacter(input));
    }
    public static String numberOfTheCharacter(String input) {
        String result= "";

        for (int  i= input.length(); i>=0; i--); {
            result= String.valueOf(input.length());
        }
        return result;
    }
}
