import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            int gcd = A;
            int b = B;
            while (b != 0) {
                int temp = gcd % b;
                gcd = b;
                b = temp;
            }
            
            sb.append(A * B / gcd).append("\n");
        }
        System.out.print(sb.toString());
    }
}
