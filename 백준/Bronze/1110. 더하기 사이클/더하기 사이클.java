import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
//      0~99 0~9면 앞에 0 붙여서 두자리 수 만들기.

//      각 자리의 숫자를 더한다. 그 다음,주어진 수의 가장 오른쪽 자리 수와
//      앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다

//      26(N) => 1) 2+6=8(splitSum) / 2) 68 (1사이클)
//            1) 6+8=14 / 2) 84 (2사이클)
//            1) 8+4=12 / 2) 42 (3사이클)
//            1) 4+2=6 / 2) 26 (4사이클)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cycleCount = 0;
        int N = Integer.parseInt(br.readLine());
        int origin = N;

        do {
            int splitSum = (N/10) + (N%10);
            String convert = N%10 + String.valueOf(splitSum%10);
            N = Integer.parseInt(convert);

            cycleCount++;
        } while (origin != N);

        sb.append(cycleCount);
        System.out.println(sb);
        br.close();
    }
}
