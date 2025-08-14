package jtp;

public class fibonacci {

    // iterator mehthod
    // public static void main(String[] args) {
    //     int n1= 0,n2=1,n3;
    //     System.out.println(n1);
    //     System.out.println(n2);
    //     for (int i=0; i<10;i++){
    //         n3= n1+n2;
    //         System.out.println(n3);
    //         n1=n2;
    //         n2=n3;
    //     }
    
        
    // }

    //recursive method

    public static void main(String[] args) {
        //input for number of fibonacci numbers
        int n=10;
        for(int i=0;i<n;i++){
        System.out.println(fibonacci(i));
        
        }

    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        } else{
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }
    
}
