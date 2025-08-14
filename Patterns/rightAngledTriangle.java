// pattern to print a right angled triangle

package Patterns;


class rightAngledTriangle{

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
}

//    public static void main(String [] args){
//        for(int i=1; i<=5;i++){
//            // System.out.print("k");
//            for(int j=1; j<= i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//    }
