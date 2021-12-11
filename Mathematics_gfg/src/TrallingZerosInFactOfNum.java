import java.util.Scanner;

public class TrallingZerosInFactOfNum {
    public static void main(String[] args) {
        System.out.println("enter number of time you wann test");
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            System.out.println("\n enter number");
            long num = scanner.nextInt();
            long res = 0;
            System.out.println("Trailling zero in factorial of num : " + trailZero(num));
        }
    }

    private static long trailZero(long num) {

        long res=0;
        for(int i=5;i<=num;i=i*5)
        {
            res+=num/i;
        }
        return res;
    }
}
//
// 1*2*3*4*5*6*7*8*9*10