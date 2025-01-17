import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        int[] costs = new int[M];
        int requiredPrizes = M - 1;

        for (int i = 0; i < M; i++) {
            String[] line = br.readLine().split(" ");
            int A = Integer.parseInt(line[0]);
            int B = Integer.parseInt(line[1]);

            if (A >= N) {
                costs[i] = 0;
            } else {
                costs[i] = N - A;
            }
        }

        Arrays.sort(costs);
        int minCost = 0;

        for (int i = 0; i < requiredPrizes; i++) {
            minCost += costs[i];
        }

        System.out.println(minCost);
    }
}