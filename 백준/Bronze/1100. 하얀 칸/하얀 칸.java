import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        for (int i = 0; i < 8; i++) {
            String row = br.readLine();
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0 && row.charAt(j) == 'F') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
