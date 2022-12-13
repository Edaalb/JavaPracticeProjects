package practiceQuestions;

public class AverageValue {

    public static <arr> void main(String[] args) {

    //* write a java program that calculates the average value of array elements
        //         * Print elements that are greater than average
        //         * Input[]= {1,2,3,4,5,6,7}
        //         * Output : 4

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        //calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];

        //calculate average value
        double average = sum / arr.length;

        System.out.println("Average value of the array elements is : " + average);
        System.out.println("The numbers greater than the average are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                System.out.println(arr[i]);

            }
        }
    }
}
