/* 

Validating Leap Years
Difficulty: Easy
Topics: Basic Programming, Date Handling
Description: Write a program to check if a given year is a leap year.
Example:
Input: year = 2020
Output: Leap Year
Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.

 */

import java.util.Scanner;

public class leapYear {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the year : ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "  is a leap year");
                } else {
                    System.out.println(year + "  is not  a leap year");

                }
            } else {
                System.out.println(year + "  is a leap year");
            }
        } else {
            System.out.println(year + "  is not a leap year");
        }
        sc.close();
    }
}
