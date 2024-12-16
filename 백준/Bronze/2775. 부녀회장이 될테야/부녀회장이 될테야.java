import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
//      a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지
//      사람들의 수의 합만큼 사람들을 데려와 살아야 한다
//      => a층b호(2층2호) = 1층의 1호부터 2호까지 사람 수의 합 = 1층1호 + 1층2호

//      주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라
//      단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine()); // k층
            int n = Integer.parseInt(br.readLine()); // n호

            sb.append(people(k, n)).append("\n");
        }

        System.out.println(sb);
    }

    public static int people(int k, int n) {
        int[][] apartment = new int[k + 1][n + 1];

        // 0층
        for (int i = 0; i <= n; i++) {
            apartment[0][i] = i;
        }

        // 1층 이상
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                apartment[i][j] = apartment[i - 1][j] + apartment[i][j - 1];
            }
        }

        return apartment[k][n];
    }
}
