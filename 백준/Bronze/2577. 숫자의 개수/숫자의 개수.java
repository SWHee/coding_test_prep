import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
//      3자리 x 3자리 x 3자리 = 100,000,000 => int형 ok
//      결과값에 0~9의 숫자가 몇 번씩 쓰였는지 줄바꿈으로 출력
//      10개의 배열 선언 후 숫자 하나씩 읽어올 때 마다 값에 카운트
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        int multiplicationResult = num1 * num2 * num3;
        int[] numCount = new int[10];

        String convert = String.valueOf(multiplicationResult);
        for (int i = 0; i < convert.length(); i++) {
            char oneOfnum = convert.charAt(i);
            numCount[Integer.parseInt(String.valueOf(oneOfnum))]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numCount[i]);
        }

        br.close();
    }
}
