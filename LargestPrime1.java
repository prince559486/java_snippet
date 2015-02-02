import java.util.Scanner;

class LargestPrime1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value of n:");

        long n = Long.parseLong(sc.nextLine());
        long k = 0;
        long f = 0;

        long c = 0;

        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                k = i;
                c = k;
                for (long j = 2; j < k; j++) {
                    if (k % j == 0) {
                        f = 1;
                    }
                }
                if (f == 0 && k > 0 && c != 2) {
                    System.out.println(k + " is a prime factor of " + n);
                }
            }

            if (c == 2) {
                System.out.println("2 is  a prime factor of" + n);
            }


        }
        System.out.println(+k);
    }
}