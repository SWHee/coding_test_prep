import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String censor = "CAMBRIDGE";

        for (char c : input.toCharArray()) {
            if (censor.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
