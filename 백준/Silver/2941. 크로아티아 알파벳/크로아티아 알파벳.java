import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int howManyWords = 0;

        String[] pattern = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < pattern.length; i++) {
            if (input.contains(pattern[i])) {
                input = input.replaceAll(pattern[i], "*");
            }
        }

        String[] count = input.split("");


        System.out.println(count.length);

        br.close();
    }
}
