import java.util.Scanner;

public class drawer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Waiting...");
        int maxLen = scanner.nextInt();

        if (maxLen % 2 != 0) {
            System.out.print("[ERR] Invalid value");
            return;
        }

        int halfVal = maxLen / 2;
        int cur = halfVal;
        int tabulation = maxLen;
        for (int i = 0; i <= halfVal; i++) {
            for (int t = 0; t <= tabulation; t++) {
                System.out.print(" ");
            }
            for (int j = cur; j >= 0; j--) {
                String ch = (i == 0 || j == 0 || j == cur) ? "*" : "#";
                System.out.print(ch);
            }
            if (i != halfVal) { System.out.print("\n"); }
            tabulation--;
            cur--;
        }

        for (int i = 0; i <= halfVal; i++) {
            for (int t = 0; t <= tabulation; t++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= cur; j++) {
                String ch = (i == halfVal || j == 0 || j == cur) ? "*" : "#";
                System.out.print(ch);
            }
            System.out.print("\n");
            tabulation--;
            cur++;
        }
    }
    
}
