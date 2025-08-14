package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        PatternPyramid(5);
    }

    //n is my number of rows
    static void PatternPyramid(int n){

        //outer loop for rows
        for(int i = 1; i<= 5; i++){

            //inner loop that prints spaces
            for(int j = 1; j<= 5 -i; j++){
                System.out.print(" ");
            }

//            //inner loop that print star
//            for(int k = 1; k<=2*i-1; k++){
//                System.out.print(k);
//            }
            // inner loop prints a left handed triangle with number
            for(int j = 1; j<= i; j++){
                System.out.print(j);
            }
            //inner loop prints a right handed triangle withh number
            for(int k = i-1; k>= 1; k--){
                System.out.print(k);

            }

            //moves to next line
            System.out.println();

        }


    }

}
