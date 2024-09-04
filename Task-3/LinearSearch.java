public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found, return its index
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int index = linearSearch(arr, target);

        if (index == -1) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Target found at index: " + index);
        }
    }
}