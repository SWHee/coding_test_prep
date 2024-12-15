import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//      최대공약수 gcd
//      최소공배수 lcm => a*b를 최대공약수로 나눈것과 같음

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcd = 0;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        int lcm = Math.max(num1, num2);
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break; // 둘 다 나누어 떨어지면 최소 공배수
            }
            lcm++; // 공배수를 찾을 때까지 증가
        }

        sb.append(gcd).append("\n").append(lcm);
        System.out.println(sb);
    }
}
