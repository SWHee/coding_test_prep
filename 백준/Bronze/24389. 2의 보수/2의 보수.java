import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int twoComplement = ~N + 1;

        int xor = N ^ twoComplement;
        int diffCount = Integer.bitCount(xor);

        sb.append(diffCount);
        System.out.println(sb);
    }
}