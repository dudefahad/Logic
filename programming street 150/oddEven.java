
import java.util.Scanner;

/* Determining Even/Odd Numbers
    Difficulty: Easy
    Topics: Basic Programming
    Description: Write a program to check whether a number is even or odd.
    Example:
    Input: number = 4
    Output: Even
    Explanation: Since 4 is divisible by 2, it is an even number. */



class oddEven{
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num= sc.nextInt();
        sc.close();

        if(num%2==0){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num +" is Odd");
        }
    }
}