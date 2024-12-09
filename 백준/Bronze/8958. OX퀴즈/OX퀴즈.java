import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
//      O = 정답, X = 오답
//      해당 문제의 정답은 연속된 O의 개수만큼 +1 점
//      "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            String oxStirng = br.readLine();

            int scoreSet = 1;
            int scoreSum = 0;

            for (int j = 0; j < oxStirng.length(); j++) {
                if (oxStirng.charAt(j) == 'O') {
                    scoreSum += scoreSet;
                    scoreSet++;
                } else if (oxStirng.charAt(j) == 'X') {
                    scoreSet = 1;
                }
            }

            System.out.println(scoreSum);
        }

        br.close();
    }
}
