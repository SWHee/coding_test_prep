import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int maxIdx = 0;

        for (int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num > max) {
                max = num;
                maxIdx = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIdx);
    }
}
