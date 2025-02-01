import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] baskets = new int[N];
        
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int k = Integer.parseInt(st.nextToken());
            
            for (int b = i; b <= j; b++) {
                baskets[b] = k;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int b = 0; b < N; b++) {
            sb.append(baskets[b]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
