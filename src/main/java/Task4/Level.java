package Task4;

public class Level {
    public static void main(String[] args) {
        // "'(', ')', '{', '}', '[' і ']'"
        boolean result = Task4.isValidStr("'(', ['{'},] {'}', ')' '[' і ']'");
        System.out.println("RES " + result);
    }
}
