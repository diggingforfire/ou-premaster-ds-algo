package diggingforfire;
import java.util.Stack;

public class Main {

    private static Stack<Integer> firstTower = new Stack<>();
    private static Stack<Integer> secondTower = new Stack<>();
    private static Stack<Integer> thirdTower = new Stack<>();

    public static void main(String[] args) {

        int numDisks = 3;

        for (int i = numDisks; i > 0; i--) {
            firstTower.push(i);
        }

        solve(numDisks, firstTower, thirdTower, secondTower);
    }

    public static void solve(int n, Stack<Integer> source, Stack<Integer> target, Stack<Integer> aux) {
        if (n > 0) {
            solve(n - 1, source, aux, target);

            target.push(source.pop());

            System.out.println(firstTower);
            System.out.println(secondTower);
            System.out.println(thirdTower);

            solve(n - 1, aux, target, source);
        }
    }
}
