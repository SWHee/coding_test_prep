import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
//          테스트 케이스 표시용 T, 찾은 횟수 answer
            int T = Integer.parseInt(br.readLine());
            int answer = 0;

//          찾을 타겟 문장
            String target = br.readLine();
            char[] targetArr = target.toCharArray();

//          입력받은 문장
            String text = br.readLine();
            char[] textArr = text.toCharArray();

//          text, target 비교
            for (int j = 0; j <= text.length() - target.length(); j++) {
                boolean found = true;
                for (int k = 0; k < target.length(); k++) {
                    if (targetArr[k] != textArr[j + k]) {
                        found = false;
                        break;
                    }
                }
                if (found) answer++;
            }

            sb.append("#").append(T).append(" ").append(answer).append("\n");
        }
        
         System.out.println(sb);
    }
}