import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            if (N < 2 || N > 100) {
                System.out.println("2 이상 100 이하 정수만 입력 가능합니다");
                return;
            }

            int[] block = new int[N];
            for (int i = 0; i < N; i++) {
                block[i] = sc.nextInt();
            }

            int maxHigh = 0; // 상승 난이도의 최댓값
            int maxLow = 0;  // 하강 난이도의 최댓값

            for (int i = 0; i < N - 1; i++) {
                int diff = block[i + 1] - block[i];
                if (diff > 0) {
                    maxHigh = Math.max(maxHigh, diff);
                } else {
                    maxLow = Math.max(maxLow, -diff);
                }
            }

            System.out.println("#" + test_case + " " + maxHigh + " " + maxLow);
        }

        sc.close();
    }
}
