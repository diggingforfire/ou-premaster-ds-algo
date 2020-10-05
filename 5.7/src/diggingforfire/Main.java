package diggingforfire;

public class Main {

    public static void main(String[] args) {
        int[] data = new int[] { 4, 1, 6, 5, 13, 4, 11, 0, 5 };
        int result = binaryRecursionMax(data, 0, data.length - 1, 0);
        System.out.println(result);
    }

    public static int binaryRecursionMax(int[] data, int low, int high, int max) {
        if (low > high) {
            return max;
        } else if (low == high) {
            return Math.max(data[low], max);
        } else {
            int mid = (low + high) / 2;
            int maxLeft = binaryRecursionMax(data, low, mid, max);
            int maxRight = binaryRecursionMax(data, mid + 1, high, max);
            return Math.max(maxLeft, maxRight);
        }
    }
}
