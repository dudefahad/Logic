

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
 /*

class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the numebr to check for prime : ");
        int num = sc.nextInt();
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + "is a prime number");
                } else {
                    System.out.println(num + " is not a prime number");
                }
            }
        } else {
            System.out.println("numbers less than one or one itself are not considered prime");

            sc.close();
        }
    }
}
     

 */
public class Prime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // found a divisor → not prime
            }
        }
        return true; // no divisors found → prime
    }

    public static void main(String[] args) {
        System.out.println(isPrime(8)); // false
        System.out.println(isPrime(7)); // true
    }
}

// class Prime {
//     public static boolean isPrime(int n) {
//         if (n > 1) {
//             for (int i = 2; i < n; i++) {
//                 if (n % i == 0) {
//                     return true;
//                 } else {
//                     return false;
//                 }
//             }
//         } else {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(8));
//     }
// }
