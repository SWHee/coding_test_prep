import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dice = new int[3];
        int maxDice = Integer.MIN_VALUE;
        int sameDice = 0;
        int price = 0;

        for (int i = 0; i < 3; i++) {
            dice[i] = Integer.parseInt(st.nextToken());
            if (maxDice < dice[i]) maxDice = dice[i];
        }

        if (maxDice == dice[0] && maxDice == dice[1] && maxDice == dice[2])  {
            price = 10000 + (1000 * maxDice);
        } else if (dice[0] != dice[1] && dice[1] != dice[2] && dice[0] != dice[2]) {
            price = maxDice * 100;
        } else {
            if (dice[0] == dice[1]) sameDice = dice[0];
            else if (dice[0] == dice[2]) sameDice = dice[2];
            else sameDice = dice[1];
            price = (sameDice * 100) + 1000;
        }

        System.out.print(price);
    }
}
