import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        
        HashSet <Integer> set= new HashSet<>();
        set.add(8);
        set.add(778);
        set.add(458);
        set.add(0);
        set.add(9);
        set.add(84);

        System.out.println(set);
        // set operations

        boolean k=set.contains(9);
        System.out.println(k);

        System.out.println(set.contains(77));

        //Traversing through the set 
        for(Integer t: set){
            System.out.println(t);
            
        }

        //changing collection types
        TreeSet <Integer> tset= new TreeSet<>();
        for(Integer z: set){
            tset.add(z);
        }

        System.out.println(tset);
        System.out.println(tset.getClass().getName());



        //changing to arraylist 
        ArrayList <Integer> al= new ArrayList<>();
         for(Integer s: set){
            al.add(s);
        }
        System.out.println(al);
        System.out.println(al.getClass().getName());

    }
    
}
