import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 두 세 자리 수 입력
        String[] input = br.readLine().split(" ");

        // 숫자 뒤집기 및 비교
        int reversedA = Integer.parseInt(new StringBuilder(input[0]).reverse().toString());
        int reversedB = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());

        // 더 큰 수 출력
        System.out.println(Math.max(reversedA, reversedB));
    }
}
