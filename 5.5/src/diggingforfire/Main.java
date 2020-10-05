package diggingforfire;

public class Main {

    public static void main(String[] args) {
        String input = "Guacemole";
        String result = reverseString(input);
        System.out.println(result);
    }

    private static String reverseString(String string) {
        if (string.equals("")) {
            return string;
        }
        return reverseString(string.substring(1)) + string.substring(0, 1);
    }
}
