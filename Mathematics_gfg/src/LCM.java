import java.util.Scanner;

public class LCM {

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
                long gcd=new GCDOrHCF().gcd(n,m);
                System.out.println("LCM : " + (m * n) / gcd);
            }
            catch (GcdException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
