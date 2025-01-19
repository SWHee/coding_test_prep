import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            String X = br.readLine();
            boolean[] digitSeen = new boolean[10];
            int count = 0;

            for (int j = 0; j < X.length(); j++) {
                int digit = X.charAt(j) - '0';
                if (!digitSeen[digit]) {
                    digitSeen[digit] = true;
                    count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }
}
