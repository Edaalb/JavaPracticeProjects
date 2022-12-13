package practiceQuestions;

import java.util.Arrays;

public class SquaresOfElements {

    public static <arr> void main(String[] args) {

        //given an int array and find the squares of the elements
        //        Example:{2,6,4,5,8,9}
        //        output:{4,36,16,25,64,81}

        int[] arr = {2, 6, 4, 5, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr [i] ;
        }
        System.out.println(Arrays.toString(arr));
        arr squareOfElements;
    }
    public static int[] squareOfElements(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr [i] = arr[i]*arr[i];
        }
        return arr;
    }
}
