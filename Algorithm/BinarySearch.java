

public class BinarySearch {

    public static void main(String args[]) {

        int[] arraylist = {5, 8, 15, 16, 19, 20};
        int target = 8;
        callingBinarySearch(arraylist, target);
    }

    private static void callingBinarySearch(int[] arraylist, int target) {
        int left = 0;
        int right = arraylist.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arraylist[mid] == target) {
                System.out.println("Target element found at index: " + mid);
                return; // Optional: Exit after finding the target
            } else if (arraylist[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Target element not found in the array.");
    }
}