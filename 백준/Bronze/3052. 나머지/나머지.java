import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
//      10개의 수를 입력받고 42로 나눈 나머지를 구한다.
//      나머지 중 서로 다른 값이 몇 개 있는지 출력 => 중복 x 하라는 뜻

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine()) % 42;
            hs.add(number);
        }

        System.out.println(hs.size());

    }
}
