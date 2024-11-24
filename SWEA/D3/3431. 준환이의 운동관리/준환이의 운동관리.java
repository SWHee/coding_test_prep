import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 1; t <= T; t++) {
            int L = scanner.nextInt();
            int U = scanner.nextInt();
            int X = scanner.nextInt();

            if (X > U) {
                System.out.println("#" + t + " -1");
            } else if (X < L) {
                System.out.println("#" + t + " " + (L - X)); 
            } else {
                System.out.println("#" + t + " 0");
            }
        }

        scanner.close();
    }
}
