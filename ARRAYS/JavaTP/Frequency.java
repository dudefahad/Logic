// COME BACK AND LATER SOLVE THE SAME PROBLEM WITH THE HASHMAP IMPLEMENTATION. for which the code is in the bottom

/*Java Program to find the frequency of each element in the array */
public class Frequency{
    public static void main(String[] args) {
        int [] arr={2,4,6,3,5,2,3,6,3,4,5,6,3};
        boolean visited[]=new boolean[arr.length];

        System.out.println("Elements : Frequency");
        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            int count= 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+ " :" +count);

        }
    }
}


//PRACTISED ON 150015082025
// public class Frequency{
//     public static void main(String[] args) {

//         int [] arr={3,4,5,3,6,8,3,1,2,7,2,3,5,8};
//         boolean visited [] = new boolean[arr.length];   

//         System.out.println( "Elements  : Frequency" );
//         for (int i = 0; i < arr.length; i++) {
//             if(visited[i]==true){
//                 continue;
//             }
//             int count=1;
//             for(int j=i+1; j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                     visited[j]=true;
//                 }
//             }
//             System.out.println(arr[i]+" : "+ count);
//         }

//     }
// }


//Hashmap implementation 

// import java.util.HashMap;
// import java.util.Map;

// public class Frequency {
//     public static void main(String[] args) {

//         int[] arr = {3, 4, 5, 3, 6, 8, 3, 1, 2, 7, 2, 3, 5, 8};

//         // Create a HashMap to store element as key and frequency as value
//         HashMap<Integer, Integer> frequencyMap = new HashMap<>();

//         // Traverse the array once
//         for (int num : arr) {
//             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//         }

//         // Print the frequency
//         System.out.println("Elements : Frequency");
//         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//             System.out.println(entry.getKey() + " : " + entry.getValue());
//         }
//     }
// }
