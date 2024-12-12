import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
//      종말의 수 = 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수
//      6번째 = 5666 / 7번째 = 6660 / 8번째 = 6661 9-6662 10-6663 11-6664 12-6665 13-6666 14-6667

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // N번째 종말의 수
        int idx = 1;
        int deathNum = 666; // 1번째 종말의 수

        while (idx <= N) {
            if (String.valueOf(deathNum).contains("666")) {
                idx++;
                deathNum++;
            } else {
                deathNum++;
            }
        }

        System.out.println(deathNum - 1); // 마지막에 증가된 값 -1

    }
}
