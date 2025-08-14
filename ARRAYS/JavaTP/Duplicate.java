/*Java Program to print the duplicate elements of an array */
// Java Program to print the duplicate elements of an array
public class Duplicate {
    public static void main(String[] args) {
        // Declare and initialize the input array
        int[] arr = {2, 1, 4, 2, 5, 4, 4, 4, 4, 6, 3, 4, 7, 4};

        // Boolean array to track which elements have been already visited
        boolean[] visited = new boolean[arr.length];

        // Outer loop to pick each element one by one
        for (int i = 0; i < arr.length; i++) {
            // Skip the current iteration if the element is already processed
            if (visited[i]) {
                continue;
            }

            // Flag to check if the current element has any duplicates
            boolean isDuplicate = false;

            // Inner loop to compare the current element with the rest of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;    // Mark duplicate element as visited
                    isDuplicate = true;   // Set flag since a duplicate was found
                }
            }

            // If duplicate(s) found, mark the current element as visited and print it
            if (isDuplicate) {
                visited[i] = true;
                System.out.println("Duplicate element: " + arr[i]);
            }
        }
    }
}

// dabba version , dosent work 
// for(int i=0;i<arr.length;i++){
//     for(int j=i+1;j<arr.length;j++){
//         if(arr[i]==arr[j]){
//             System.out.println("dupliate element found  : "+arr[i]);
//             break;
//         }
//     }
// }