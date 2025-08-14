/*Java Program to find the frequency of each element in the array */
public class Frequency{
    public static void main(String[] args) {
        int [] arr={2,4,6,3,5,2,3,6,3,4,5,6,3};
        boolean visited[]=new boolean[arr.length];

        System.out.println("Elements : Frequency");
        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            int count= 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+ " :" +count);

        }
    }
}