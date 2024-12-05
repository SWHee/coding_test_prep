import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 총 금액 X, 구매한 물건 종류의 수 N
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        // 모든 물건의 합 sum, N개의 줄에 물건의 가격 a, 개수 b
        int sum = 0;
        for (int i = 0; i < N; i++) {
            String[] buy = br.readLine().split(" ");

            int a = Integer.parseInt(buy[0]);
            int b = Integer.parseInt(buy[1]);

            sum += a*b;
        }

        if (X == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
