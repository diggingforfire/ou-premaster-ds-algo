package diggingforfire;

public class Main {

    public static void main(String[] args) {
        int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        boolean contains = contains(data, 0, 8);
        System.out.println(contains); // false
    }

    public static boolean contains(int[] data, int n, int k) {
        if (data[n] == k) {
            return true;
        } else if (n + 1 == data.length) {
            return false;
        } else{
            return contains(data, n + 1, k);
        }
    }
}
