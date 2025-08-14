
import java.util.Scanner;

/*  
Checking for Prime Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is prime.
Example:
Input: number = 7
Output: Prime
Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.
 */

class Prime{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the numebr to check for prime : ");
        int num=sc.nextInt();
        if(num>1){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println(num +"is a prime number");
                }else {
                    System.out.println(num+" is not a prime number");
                }
            }
        }else{
            System.out.println("numbers less than one or one itself are not considered prime");

        }
    }
}