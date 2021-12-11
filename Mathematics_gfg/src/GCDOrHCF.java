import java.util.Scanner;

public class GCDOrHCF {
    public static void main(String[] args) {
        System.out.println("enter number of time you wann test");
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            System.out.println("\n enter number");
            long n = scanner.nextLong();
            long res = 0;
            long m = scanner.nextLong();
            try {
                System.out.println("GCD of nos : " + gcd(n, m));
            } catch (GcdException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public static long gcd(long n, long m) {
        long res = 0;
        if (m == 0) throw new GcdException();

        else if (n % m == 0) return m;
        else
            return res = gcd(m, n % m);


    }
}