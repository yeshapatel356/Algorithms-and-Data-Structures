package linear_data_structure;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtablesample = new Hashtable<>();

        hashtablesample.put("a", 23);
        hashtablesample.put("b", 22);
        hashtablesample.put("c", 23);
        System.out.println("Intial hashtabl: " + hashtablesample);
        int value_of_A = hashtablesample.get("c");
        System.out.println("Value of A: " + value_of_A);
 

        hashtablesample.remove("b");
        System.out.println("hashtabl: " + hashtablesample);
 
    }
}
