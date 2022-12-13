package practiceQuestions;

public class Merge {
    // Question 3
    //Merge them
    //You have 2 words, both of them have 3 characters.
    //If either of them does not have exactly 3 characters, print "cannot merge"
    //Merge their characters one by one and print together like below:
    //```
    //Input:
    //aok
    //lol
    //Output:
    //alookl
    //Input:
    //java
    //wow
    //Output:
    //cannot merge

    public static void main(String[] args) {
        String a= "aok";
        String b= "lol";
        String c= "java";
        String d= "wow";

        if (a.length()<=3 && b.length()<=3) {
            System.out.println( "Output : " + (a.substring(0,1) + b.substring(0,1) + a.substring(1,2) + b.substring(1,2) + a.substring(2,3) + b.substring(2,3)));
        }
        if (c.length()<=3 && d.length()<=3) {
            System.out.println( "Output : " + (a.substring(0,1) + b.substring(0,1) + a.substring(1,2) + b.substring(1,2) + a.substring(2,3) + b.substring(2,3)));
        }
        else
            System.out.println("Output: Cannot Merge");
    }
}
