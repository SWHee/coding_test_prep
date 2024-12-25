import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        char[] word = input.toCharArray();

        for (int i = 0; i < word.length; i++) {
            if (Character.isAlphabetic(word[i])) {
                if (word[i] >= 'A' && word[i] <= 'Z') {
                    word[i] = (char) ((word[i] - 'A' + 13) % 26 + 'A');
                } else if (word[i] >= 'a' && word[i] <= 'z') {
                    word[i] = (char) ((word[i] - 'a' + 13) % 26 + 'a');
                }
            }
            sb.append(word[i]);
        }
        System.out.println(sb);
    }
}
