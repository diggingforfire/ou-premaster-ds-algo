package diggingforfire;

public class Main {

    public static void main(String[] args) {
	    int[] values = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    boolean result = binarySearch(values, 9, 0, values.length - 1); // true
    }

    public static boolean  binarySearch(int[] data, int target, int low, int high) {
        if (low > high) {
            return false;
        } else {
            int mid = (low + high) / 2;
            if (target == data[mid]) {
                return true;
            } else if (target < data[mid]) {
                return binarySearch(data, target, low, mid -1);
            } else {
                return binarySearch(data, target, mid + 1, high);
            }
        }
    }
}
