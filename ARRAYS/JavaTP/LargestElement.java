

/*Java Program to print the elements of an array */
public class LargestElement {
    public static void main(String[] args) {
        int [] arr= {5,6,7,33,56,89,33,55,99};
        int max= arr[0];  
        // largest element
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Largest Element : "+ max);
        //smallest element 
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        
        System.out.println("Lowest Element : "+ min);


    }
}
//------------------------------------------------------------------------------------------------------------


/*
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 33, 56, 89, 33, 55, 99};

        int max = arr[0]; // assume first element is largest
        int min = arr[0]; // assume first element is smallest

        // Loop once and update both max and min
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Largest Element : " + max);
        System.out.println("Lowest Element  : " + min);
    }
}
     */