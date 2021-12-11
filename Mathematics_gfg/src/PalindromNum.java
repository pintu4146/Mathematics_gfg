import java.util.Scanner;

public class PalindromNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of time wann test");
        int testCase = sc.nextInt();
        while (testCase-- > 0) {
            System.out.println("enter num wann test");
            int num = sc.nextInt();
            boolean res = isPalindrom(num);
            System.out.println(res);
        }
    }

    private static boolean isPalindrom(int num) {
        int rev = 0;
        int org = num;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev == org ? true : false;
    }
}
