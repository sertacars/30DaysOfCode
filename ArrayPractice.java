import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        // slots 0  1   2   3   4
        //      [0, 5,  3,  2 , 1] --> length 5


        //declaring, allocating and initializing arrays
        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {5, 2, 9, 1, 3};

        String[] shoppingList = {"bananas", "apples", "pears"};

        //print out arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));

    }
    
}
