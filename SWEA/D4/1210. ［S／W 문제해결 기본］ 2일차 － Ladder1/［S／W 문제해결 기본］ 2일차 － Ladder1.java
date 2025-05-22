import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//      10개의 테스트 케이스 만큼
        for (int i = 1; i <= 10; i++) {
            int T = Integer.parseInt(br.readLine());
            int[][] ladderArr = new int[100][100];

//          사다리 배열 대입
            for (int j = 0; j < 100; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 100; k++) {
                    ladderArr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            int X = 0;
            for (int j = 0; j < 100; j++) {
                if (ladderArr[99][j] == 2) {
                    X = j;
                    break; // 찾았으니 바로 종료
                }
            }


            /*
             * 1) 출발점을 반환 => 도착점 2에서 출발해서 올라가기
             * 2) 위로 한 칸 올라갈 때마다 좌우 검사
             *   - 1) 좌우 중 1인 값 있을 경우 방향 전환 /
             *   - 2) 그 방향으로 가다가 그 다음이 0일 경우에는 멈추고 다시 위로 가야함
             * 3) [][]에서 첫번째 인덱스가 0일때의 두번째 인덱스 값 출력.
             */

            int y = 99;
            while (y > 0) {
                if (X > 0 && ladderArr[y][X - 1] == 1) {
                    while (X > 0 && ladderArr[y][X - 1] == 1) {
                        X--;
                    }
                } else if (X < 99 && ladderArr[y][X + 1] == 1) {
                    while (X < 99 && ladderArr[y][X + 1] == 1) {
                        X++;
                    }
                }

                y--;
            }


            sb.append("#").append(T).append(" ").append(X).append("\n");
        }

        System.out.println(sb);
    }
}
