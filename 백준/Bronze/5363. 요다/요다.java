import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            String sentence = br.readLine();
            String[] words = sentence.split(" ");
            String firstTwoWords = words[0] + " " + words[1];
            StringBuilder restOfTheSentence = new StringBuilder();
            
            for (int j = 2; j < words.length; j++) {
                restOfTheSentence.append(words[j]).append(" ");
            }
            
            System.out.println(restOfTheSentence.toString().trim() + " " + firstTwoWords);
        }
    }
}
