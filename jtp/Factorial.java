package jtp;

import java.util.Scanner;

public class Factorial {

    //iterator method
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("enter the number : ");
    //     int fact=1;
    //     int num= sc.nextInt();
    //     for (int i=1;i<=num;i++){
    //         fact=fact*i;
    //     }
    //     System.out.println("The factorial is "+fact);
    // }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("the factorial of "+n+ " is "+fact);
        
    }


    public static int factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }
    
}
