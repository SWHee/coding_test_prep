import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);

        long a = A, b = B;
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        long gcdValue = a;
        long lcm = (A * B) / gcdValue;

        System.out.println(lcm);
    }
}