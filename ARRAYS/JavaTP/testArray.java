
public class testArray {

    public static void main(String[] args) {

        //TWO DIMENSIONAL ARRAYS 
        int[][] arar = new int[4][4];

        int[][] arar1 = {
            {4, 5, 8, 3},
            {9, 3, 6, 2},
            {0, 6, 3, 7}

        };

        for (int i = 0; i < arar1.length; i++) {
            for (int j = 0; j < arar1.length; j++) {
                System.out.print(arar1[i][j] + " ");
            }
            System.out.println();
        }

        /* 
        //searching a elemeny in a array
        int[] arr2 = {22, 3, 54, 8, 3, 5, 78, 43, 8, 4, 90, - 144};

        int sum = 0;

        for (int idx = 0; idx < arr2.length; idx++) {
            sum = sum + arr2[idx];

        }
        System.out.println(sum);

        // int find = 4;
        // int max = arr2[1];
        // int min = arr2[1];
        //REVERSING AN ARRRAY  
        // int len = arr2.length;
        // System.out.println(Arrays.toString(arr2));
        // for (int i = arr2.length - 1; i >= 0; i--) {
        //     System.out.print(arr2[i] + ",");
        // }
        //MINIMUM ELEMENT
        // for (int i = 0; i < arr2.length; i++) {
        //     if (arr2[i] < min) {
        //         min = arr2[i];
        //     }
        // }
        // System.out.println(min);
        //MAXIMUM ELEMENT
        // for (int i = 0; i < arr2.length; i++) {
        //     if (arr2[i] > max) {
        //         max = arr2[i];
        //     }
        // }
        // System.out.println(max);
        // for (int i = 0; i < arr2.length; i++) {
        // for (int x : arr2) {
        //     if (x == find) {
        //         System.out.println(x);
        //     }
        // }
        // int[] arr = {1, 2, 5, 8};
        // int[] arr1 = new int[10];
        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i] = i;
        // }
        // for (int x : arr1) {
        //     System.out.print(x + " ");
        // }
        // System.out.println(arr1);
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr));

         */
    }

}
