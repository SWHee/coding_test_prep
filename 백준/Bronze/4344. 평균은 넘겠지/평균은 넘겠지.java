import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//      평균을 구하고, 평균보다 큰 점수를 가진 학생 수를 계산해서 N명 * (넘은 명수/100)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int[] scores = new int[N];

            int sum = 0;
            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }

            int avg = sum / N;
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (scores[j] > avg) {
                    count++;
                }
            }

            double percent = (double) count / N * 100;

            sb.append(String.format("%.3f", percent) + "%\n");
        }

        System.out.print(sb);

    }
}
