package diggingforfire;

public class Main {

    public static void main(String[] args) {
        int[] data = new int[] {5, 3, 7, 5, 2, 9, 1, 4};
        int result = max(data, 0, 0);
        System.out.println(result);
    }

    public static int max(int[] data, int n, int max) {
        if (n == data.length) {
            return max;
        }

        if (data[n] > max) {
            max = data[n];
        }

        return max(data, n + 1, max);
    }
}
