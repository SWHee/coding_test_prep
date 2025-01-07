import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            
            int count = 0;
            for (int i = N; i <= M; i++) {
                int num = i;
                if (num == 0) {
                    count++;
                }
                while (num > 0) {
                    if (num % 10 == 0) {
                        count++;
                    }
                    num /= 10;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb.toString());
    }
}
