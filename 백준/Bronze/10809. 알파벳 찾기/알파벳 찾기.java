import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'
                , 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        String alphabet1 = "abcdefghijklmnopqrstuvwxyz";

        int[] idx = new int[26];
        Arrays.fill(idx, -1);

        for (int i = 0; i < input.length(); i++) {
            int intAlphabet = input.charAt(i) - 'a';

            if (idx[intAlphabet] == -1) idx[intAlphabet] = i;
        }

        for (int index : idx) {
            System.out.print(index + " ");
        }
    }
}
