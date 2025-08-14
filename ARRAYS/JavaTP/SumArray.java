/*Java Program to print the sum of all the items of the array */
public class SumArray {
    public static void main(String[] args) {
        int [] arr={22,4,5,77,8};
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            
        }

        // // Enhanced for-each loop for better readability
        // for (int num : arr) {
        //     sum += num; // same as sum = sum + num
        // }
        System.out.println("sum of all items of the array is : "+ sum);
    }
    
}

/*
 import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {22, 4, 5, 77, 8};

        int sum = Arrays.stream(arr).sum();  // Java 8 feature

        System.out.println("Sum of all items of the array is: " + sum);
    }
}

 */
