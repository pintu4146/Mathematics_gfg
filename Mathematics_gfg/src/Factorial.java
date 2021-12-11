import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter number of time you wann test");
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-->0){
            System.out.println("\n enter number");
            long num=scanner.nextInt();
            long res=0;
            System.out.println("fact of num : "+(fact(num) >0 ? fact(num) : "factorial of negetive is not defined in real number"));
        }
    }

    private static long fact(long num) {
        if(num<0) return -1;//
        if(num==0) return 1;
//        long fact=1;
//        for (long i = 1; i <= num; i++) {
//
//            fact*=i;
//
//        }
        return num*fact(num-1);
    }
}
