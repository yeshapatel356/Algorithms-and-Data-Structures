import javax.swing.text.html.parser.Element;

public class LinearSearch {
    public static void main (String[] args){
        int nums[] = {2,3,4,56,66,76};
        int target = 56;

        int result = linearSearch(nums, target);

        if(result != 1){
            System.out.println("Element found at index: " + result);
        }
        else{
            System.out.println(target + "Element not found");
        }
    }

    public static int linearSearch(int [] nums, int target){
       
       for(int i =0; i<nums.length;i++){
        if(nums[i]==target){
            return i;
        }
       }
        return -1;
    }
}
