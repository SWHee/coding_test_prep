import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        
        int modifiedN = (N / 100) * 100;
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if ((modifiedN + i) % F == 0) {
                result = i;
                break;
            }
        }
        
        bw.write(String.format("%02d", result));
        bw.flush();
        br.close();
        bw.close();
    }
}
