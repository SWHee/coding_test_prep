import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
//      오름차순 아닌 내림차순 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int[] numbers = new int[input.length()];

        char[] chars = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = chars[i] - '0';
        }

        Arrays.sort(numbers);

        for (int i = 1; i <= input.length(); i++) {
            sb.append(numbers[numbers.length-i]);
        }

        System.out.println(sb);
        br.close();
    }
}
