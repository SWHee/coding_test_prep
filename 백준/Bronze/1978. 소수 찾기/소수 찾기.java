import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int resultCount = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int currentNum = Integer.parseInt(st.nextToken());
            boolean isPrime = true;

            if (currentNum == 1) {
                isPrime = false;
            } else {
                for (int j = 2; j < currentNum; j++) {
                    if (currentNum % j == 0) {
                        isPrime = false;
                    }
                }
            }

            if (isPrime) resultCount++;
        }

        sb.append(resultCount);
        System.out.print(sb);

        br.close();
    }
}
