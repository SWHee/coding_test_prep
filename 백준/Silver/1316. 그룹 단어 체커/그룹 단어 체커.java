import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 100보다 작거나 같은 자연수
        int groupWordCount = 0; // 그룹 단어 개수

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] visited = new boolean[26];
            boolean isGroupWord = true;
            char prevChar = '\0'; // '\0' = null

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);

                // 이전 문자와 다르고 방문했던 문자라면
                if (currentChar != prevChar && visited[currentChar - 'a']) {
                    isGroupWord = false;
                    break;
                }

                // 현재 방문
                visited[currentChar - 'a'] = true;
                prevChar = currentChar; // 업데이트
            }

            if (isGroupWord) groupWordCount++;
        }

        sb.append(groupWordCount);
        System.out.println(sb);
        br.close();
    }
}
