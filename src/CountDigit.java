import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println("enter number of time you wann test");
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            System.out.println("\n enter number");
            long num = scanner.nextInt();
            System.out.println("# of digit in entred number is " + countDigit(num));
        }
    }

    private static long countDigit(long num) {

        return (long) Math.floor(Math.log10(num)) + 1;
    }
}
