import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//      첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, = x
//      두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. = y

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[][] square = new boolean[100][100];
        int N = Integer.parseInt(br.readLine());
        int area = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!square[j][k]) {
                        square[j][k] = true;
                    }
                }
            }

        }

        for (int j = 0; j < square.length; j++) {
            for (int k = 0; k < square.length; k++) {
                // false인 경우 넓이에 +1
                if (square[j][k]) {
                    area++;
                }
            }
        }

        sb.append(area);
        System.out.println(sb);
    }
}
