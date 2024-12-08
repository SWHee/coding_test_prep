import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
//      손님들을 정문으로부터 걷는 거리가 가장 짧은 방을 배정받도록
//      W 개의 방이 있는 H층 건물 => H x W
//      YXX나 YYXX 형태 => Y = H, X = 방 번호 (1 <= H, W <= 99)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 데이터
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken()); // N 번째 손님

            int floor = N%H == 0 ? H : N%H;
            int room = (N - 1) / H + 1;
            System.out.println(floor * 100 + room);
        }
    }
}
