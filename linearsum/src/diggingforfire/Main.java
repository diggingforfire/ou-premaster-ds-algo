package diggingforfire;

public class Main {

    public static void main(String[] args) {
        int[] input = new int[]{5,3,7,8,3,4};
        int result = linearSum(input, input.length);
        System.out.println(result); // 30
    }

    public static int linearSum(int[] data, int n) {
        if (n == 0) {
            return 0;
        }

        return linearSum(data, n - 1) + data[n - 1];
    }
}
