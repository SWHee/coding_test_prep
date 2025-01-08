import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] scores = new int[N][3];
        int[] totalScores = new int[N]; 

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                scores[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int game = 0; game < 3; game++) {
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int i = 0; i < N; i++) {
                countMap.put(scores[i][game], countMap.getOrDefault(scores[i][game], 0) + 1);
            }

            for (int i = 0; i < N; i++) {
                if (countMap.get(scores[i][game]) == 1) {
                    totalScores[i] += scores[i][game];
                }
            }
        }

        for (int score : totalScores) {
            sb.append(score).append("\n");
        }

        System.out.print(sb);
    }
}
