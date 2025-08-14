package Patterns;

public class Diamond {

    static void printDiamond(int rows){
        //top half
        //outer loop for half of the rows
        for(int i = 1; i <= rows; i++){
            //inner loop for spaces
            for(int j = 1; j <= rows-i; j++){
//                System.out.print("#");
                System.out.print(" ");

            }
            //inner loop for stars
            for(int j = 1; j <= 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
            }

        //Second half
        //outer loop for next half of the rows
        for (int i=1;i<rows;i++){
            //inner loop for spaces
            for(int j=1;j<=i;j++){
//                System.out.print("#");
                System.out.print(" ");

            }
            //inner loop for values
            for(int j=1;j<2*(rows-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printDiamond(5);
    }
}
