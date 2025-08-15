/* 
 Java Program to print the elements of an array in reverse order
 */
//Method one brute force
public class ReverseArray {
    public static void main(String[] args) {
        
        int [] arr={1,2,3,4,5,6};
        System.out.print("original Array : " );
        for(int num: arr){
            System.out.print(num +" ");
        }
        System.out.println();

        System.out.print("In reverse Order : ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] +" ");

        }

    }
    
}
//---------------------------------------------------------------------------------------------

// //METHOD E cHAT gpt

// public class ReverseArrayInPlace {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};

//         System.out.print("Original Array: ");
//         printArray(arr);

//         // Reverse in-place
//         int start = 0;
//         int end = arr.length - 1;

//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }

//         System.out.print("Reversed Array: ");
//         printArray(arr);
//     }

//     // Method to print array
//     public static void printArray(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }