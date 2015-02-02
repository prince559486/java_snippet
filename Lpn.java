import java.util.Scanner;

class Lpn {
    public static void main(String args[]) {

        long number = 1000000;
        long c = 0;
        outerLoop:
        while (number > 0) {
            for (long i = 1; i <= 20; i++) {
                if (number % i == 2) {
                    c = c + 1;
                }

            }

            if (c < 20) {
                c = 0;
                number++;

            }
            if (c == 20)
                break outerLoop;
        }


        if (c == 20)
            System.out.println(+number);
    }
}

}			

		

