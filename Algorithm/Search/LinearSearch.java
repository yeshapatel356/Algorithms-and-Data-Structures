//Time COmplexity O(n)
package Search;
import javax.swing.text.html.parser.Element;

public class LinearSearch {
    public static void main (String[] args){
        int nums[] = new int[20];
        int target = 10;

        int result = linearSearch(nums, target);

        if(result != 1){
            System.out.println("Element found at index: " + result);
        }
        else{
            System.out.println(target + "Element not found");
        }
    }

    public static int linearSearch(int [] nums, int target){
       int steps = 0;
       for(int i =0; i<nums.length;i++){
        steps++;
        if(nums[i]==target){
            System.out.println("Steps taken by linear search: " + steps);
            return i;
        }
       }
       System.out.println("Steps taken by linear search" + steps);
        return -1;
    }
}
