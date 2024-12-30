import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
//        지구를 나타내는 수를 E, 태양을 나타내는 수를 S, 달을 나타내는 수를 M이라고 했을 때,
//                이 세 수는 서로 다른 범위를 가진다.(1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int E = Integer.parseInt(input.split(" ")[0]);
        int S = Integer.parseInt(input.split(" ")[1]);
        int M = Integer.parseInt(input.split(" ")[2]);
        int year = 0;

        int compareE = 0, compareS = 0, compareM = 0;
        boolean check = true;
        do {
            year++;
            compareE++;
            compareS++;
            compareM++;
            if (compareE > 15) compareE %= 15;
            if (compareS > 28) compareS %= 28;
            if (compareM > 19) compareM %= 19;
            if(E == compareE && S == compareS && M == compareM) check = false;
        } while (check);

        sb.append(year);
        System.out.println(sb);
        br.close();
    }
}

