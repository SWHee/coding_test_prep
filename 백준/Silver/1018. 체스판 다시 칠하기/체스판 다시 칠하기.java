import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;

        // 모든 8x8 구간 탐색
        for (int sr = 0; sr <= N - 8; sr++) {
            for (int sc = 0; sc <= M - 8; sc++) {

                int repaintWhite = 0; // 왼쪽 위가 W인 경우
                int repaintBlack = 0; // 왼쪽 위가 B인 경우

                // 8x8 내부 탐색
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char current = board[sr + i][sc + j];

                        if ((i + j) % 2 == 0) {
                            if (current != 'W') repaintWhite++;
                            if (current != 'B') repaintBlack++;
                        } else {
                            if (current != 'B') repaintWhite++;
                            if (current != 'W') repaintBlack++;
                        }
                    }
                }

                int localMin = Math.min(repaintWhite, repaintBlack);
                min = Math.min(min, localMin);
            }
        }

        System.out.println(min);
    }
}
