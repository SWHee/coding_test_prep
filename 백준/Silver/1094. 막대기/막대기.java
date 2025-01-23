import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine()); // 입력값 X
        int stick = 64;
        int count = 0;

        while (X > 0) {
            if (stick > X) {
                stick /= 2;
            } else {
                count++;
                X -= stick;
            }
        }

        System.out.println(count);
    }
}
