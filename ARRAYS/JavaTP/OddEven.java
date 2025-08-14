/*Java Program to print the elements of an array present on even position
Java Program to print the elements of an array present on odd position */
public class OddEven {
public static void main(String[] args) {
    int[] arr ={2,3,4,7,9,1,6,3,7,8};
  //int[] arr1={0,1,2,3,4,5,6,7,8,9};

    for(int i=0;i<arr.length;i=i+2){
        System.out.println("Elements at "+i + "position : " +arr[i]);
    }

    System.out.println("\n ODD Numbers ");
    for(int i=1;i<arr.length;i=i+2){
        System.out.println("Elements at "+i + "position : " +arr[i]);
    }

}
    
}
