import java.util.Scanner;

public class Recursion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x:");
        double x = scanner.nextDouble();

        System.out.print("n:");
        double n = scanner.nextDouble();

        System.out.print("e:");
        double e = scanner.nextDouble();

        double a = 1f;
        double sm_e = 0f;
        double sm_e_abs = 0f;
        double sm_e_absdiv = 0f;
        
        for (int i = 0; i <= n; i++) {
            sm_e += i;
            if (Math.abs(a) > e) sm_e_abs += a;
            if (Math.abs(a) > e / 10.0) sm_e_absdiv += a;

            a = a * ((2.0 * i + 1.0) / (2.0 * i + 2.0)) * (x * x);
        }

        System.out.println(sm_e);
        System.out.println(sm_e_abs);
        System.out.println(sm_e_absdiv);
        System.out.println(a);
    }
}
