import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 통화 개수
        String[] callTimes = br.readLine().split(" "); // 통화 시간 배열
        
        int yCost = 0; // 영식 요금
        int mCost = 0; // 민식 요금

        for (int i = 0; i < N; i++) {
            int time = Integer.parseInt(callTimes[i]);

            // 영식 요금 계산 (30초당 10원)
            yCost += (time / 30 + 1) * 10;

            // 민식 요금 계산 (60초당 15원)
            mCost += (time / 60 + 1) * 15;
        }

        // 결과 출력
        if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else if (yCost > mCost) {
            System.out.println("M " + mCost);
        } else {
            System.out.println("Y M " + yCost);
        }
    }
}
