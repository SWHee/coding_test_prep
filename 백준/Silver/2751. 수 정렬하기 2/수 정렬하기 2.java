import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        // 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Integer[] sorted = Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> a - b).toArray(Integer[]::new);

        for (int num : sorted) {
            sb.append(num + "\n");
        }

        System.out.println(sb);
        br.close();
    }
}
