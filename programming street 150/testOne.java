
public class testOne {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue; // Skip when row index equals column index
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // // FOR LOOP 
        // for (int i = 0; i < 10; i = i + 2) {
        //     System.out.println(i);
        // }
        // List<Integer> num = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
        // // FOR EACH LOOP 
        // for (Integer al : num) {
        //     System.out.println(al);
        // }
        // while (s < 20) {
        //     if (s == 15) {
        //         break;
        //     }
        //     System.out.println("The value of s : " + s);
        //     s++;
        // }
        // int s = 10;
        // while (s < 20) {
        //     if (s == 15) {
        //         continue;
        //     }
        //     s++;
        //     System.out.println("The value of s : " + s);
        // }
        // int x = 10;
        // while (x < 20) {
        //     x++;
        //     if (x == 15) {
        //         continue;
        //     }
        //     System.out.print("value of x : " + x);
        //     System.out.print("\n");
        // }
    }
}
