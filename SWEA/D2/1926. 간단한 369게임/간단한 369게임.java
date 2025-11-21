import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 입력 값

        for (int i = 1; i <= N; i++) {   // 입력 값 1 ~ N 까지
            // 33이 들어왔다고 생각해보자
            String strNum = Integer.toString(i);
            int clapCount = 0;  // 박수 쳐야하는 횟수

            for (int j = 0; j < strNum.length(); j++) {   // 몇번 - 출력해야하는지 구하는 부분 -> clapCount
                char c = strNum.charAt(j);

                if (c == '3' || c == '6' || c == '9') {  // 해당 자리 숫자가 3, 6, 9 중 하나이면
                    clapCount++;
                }
            }

            if (clapCount > 0) {
                // '-'를 clapCount만큼 출력
                for (int k = 0; k < clapCount; k++) {
                    System.out.print("-");
                }
            } else {
                System.out.print(i);
            }

            System.out.print(" ");
        }
    }
}
