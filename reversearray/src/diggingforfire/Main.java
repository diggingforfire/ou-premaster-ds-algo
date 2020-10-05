package diggingforfire;

public class Main {

    public static void main(String[] args) {
	    int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	    reverseArray(data, 0, data.length - 1);
    }

    public static void reverseArray(int[] data, int low, int high) {
        if (low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }
}
