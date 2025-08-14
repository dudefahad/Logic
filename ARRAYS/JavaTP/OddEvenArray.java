/*Java Program to print odd and even numbers from an array */
public class OddEvenArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1,6,8,3};

        System.out.println("\n Even numbers : ");
        for(int k:arr){
            if(k%2==0){
                System.out.println(k);
            }
        }
        
        System.out.println("\n Odd numbers : ");
        for(int k:arr){
            if(k%2!=0){
                System.out.println(k);
            }
        }

        for (int k : arr) {
            if (k % 2 == 0) {
                System.out.println("Even: " + k);
            } else {
                System.out.println("Odd : " + k);
            }
        }
    }
}
