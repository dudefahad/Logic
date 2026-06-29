
public class testMath {

    public static void main(String[] args) {

        // This is how you count primitive integers
        // int num = 1534;
        // int temp = num;
        // int count = 0;
        // while (temp > 0) {
        //     temp = temp / 10;
        //     count++;
        // }
        // System.out.println(count);
        // getting last digit and remove it 
        int num = 12459;
        int temp = num;
        int digit = 0;
        int rev = 0;

        while (temp > 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;

        }

        System.out.println(rev);
    }
}
