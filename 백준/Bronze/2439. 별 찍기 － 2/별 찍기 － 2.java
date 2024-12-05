import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            int M = N;
            while (M-i > 0) {
                System.out.print(" ");
                M--;
            }
            System.out.println("*".repeat(i));
        }
    }
}
