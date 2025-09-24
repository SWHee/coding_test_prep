import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] a = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine().trim();
            for (int j = 0; j < M; j++) a[i][j] = line.charAt(j);
        }

        int maxLen = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int limit = Math.min(N - i, M - j);
                
                for (int len = maxLen; len <= limit; len++) {
                    int ni = i + len - 1;
                    int nj = j + len - 1;
                    char v = a[i][j];
                    if (a[i][nj] == v && a[ni][j] == v && a[ni][nj] == v) {
                        maxLen = len;
                    }
                }
            }
        }

        System.out.println(maxLen * maxLen);
    }
}
