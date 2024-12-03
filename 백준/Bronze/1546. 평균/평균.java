import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
//      과목 중 최댓값 M, 모든 점수 = 점수 x 100 / M
//      과목의 개수 N, 1000보다 작거나 같다
//      점수는 100보다 작거나 같은 자연수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] subject = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            subject[i] = Integer.parseInt(st.nextToken());
        }

        int maxScore = 0;
        for (int i = 0; i < N; i++) {
            if (maxScore < subject[i]) {
                maxScore = subject[i];
            }
        }

        double subjectSum = 0;
        for (int score : subject) {
            subjectSum += (double) score * 100 / maxScore;
        }

        System.out.println(subjectSum/N);
    }
}
