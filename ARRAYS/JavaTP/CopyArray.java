/*Java Program to copy all elements of one array into another array */
public class CopyArray{
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int[] arr2= new int [arr1.length];

        for (int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
            
        }
        
        System.out.println("printing elements of array Orriginal : ");
        for(int k:arr1){
            System.out.println(k);

        }

        System.out.println("printing elements of Copied array : ");
        for(int j:arr2){
            System.out.println(j);

        }
    }
}

/*Another Way 
public class CopyArray {
    public static void main(String[] args) {
        
        // Stegip 1: Declare and initialize the original array
        int[] arr1 = {1, 2, 3, 4, 5};
        
        // Step 2: Create an empty array of same size for manual copy
        int[] arr2 = new int[arr1.length];

        // Step 3: Copy elements manually using for loop
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];  // copy each element
        }

        // Step 4: Create another array for System.arraycopy method
        int[] arr3 = new int[arr1.length];

        // Step 5: Copy using built-in method: System.arraycopy(source, sourcePos, dest, destPos, length)
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);

        // Step 6: Print original array
        System.out.println("Original array:");
        for (int k : arr1) {
            System.out.println(k);
        }

        // Step 7: Print array copied using manual method
        System.out.println("\nCopied array using for loop:");
        for (int j : arr2) {
            System.out.println(j);
        }

        // Step 8: Print array copied using System.arraycopy()
        System.out.println("\nCopied array using System.arraycopy():");
        for (int m : arr3) {
            System.out.println(m);
        }
    }
}
 */