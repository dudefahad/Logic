// /*Java Program to left rotate the elements of an array */

// //-----------------------------------------------------------------------------------------
// //METHOD ONE FROM JAVATUTORIALS POINT
// public class LeftRotate {
//     public static void main(String[] args) {
        
//         int [] arr={1,2,3,4,5};
//         int n=3;
//         int j;

//         System.out.println("Original Array : ");
//         for(int k: arr){
//             System.out.print(k +" ");
//         }

//         for (int i=0; i<3;i++ ){
//             int first=arr[0];
//             for(j=0;j<arr.length-1;j++){
//                 arr[j]=arr[j+1];
//             }
//             arr[j]=first;
//         }
//         System.out.println();

//         //Displays resulting array after rotation  
//         System.out.println("Array after left rotation: ");  
//         for(int i = 0; i< arr.length; i++){  
//             System.out.print(arr[i] + " ");  
//         }  
//     }
// }

// //----------------------------------------------------------------------------------
//METHOD tWO FROM CHAT GPT

public class LeftRotate{
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        System.out.print("original Array : " );
        for(int num: arr){
            System.out.print(num +" ");
        }
        System.out.println();
        int n=3;
        n=n%arr.length; //Ensures that n doesn’t exceed array length. 
        leftRotate(arr, n);
    }
    
    static void leftRotate(int[] arr,int n){
        int [] temp = new int [arr.length];
        
        for(int i=0;i<arr.length;i++){
            temp[i]= arr[(i+n)% arr.length]; 
        }

        System.out.print("Left Roated Array for "+n+" Times : ");
        for(int num: temp){
            System.out.print(num + " ");
        }

    }
}
/*
(i + n) % arr.length wraps around the array.

Dry Run for arr = {1, 2, 3, 4, 5}, n = 3:

i	(i + n) % length	    temp[i] = arr[...]	        temp array after assignment

0	(0+3)%5 = 3	            arr[3] = 4	                    {4, _, _, _, _}
1	(1+3)%5 = 4	            arr[4] = 5	                    {4, 5, _, _, _}
2	(2+3)%5 = 0	            arr[0] = 1	                    {4, 5, 1, _, _}
3	(3+3)%5 = 1	            arr[1] = 2	                    {4, 5, 1, 2, _}
4	(4+3)%5 = 2	            arr[2] = 3	                    {4, 5, 1, 2, 3} 


 */