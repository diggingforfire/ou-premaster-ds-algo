package diggingforfire;

public class Main {

    public static void main(String[] args) {

        double result = pow(5, 3);
        System.out.println(result); // 125.0;
    }

    public static double pow(double base, int power) {
        if (power == 0) {
            return 1;
        }

        return base * pow(base, power - 1);
    }
}
