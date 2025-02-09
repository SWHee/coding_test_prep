import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String time = br.readLine();
        String[] parts = time.split(":");
        
        String a = parts[0];
        String b = parts[1];
        String c = parts[2];
        
        int count = 0;
        
        if (Integer.parseInt(a) >= 1 && Integer.parseInt(a) <= 12 && Integer.parseInt(b) >= 0 && Integer.parseInt(b) <= 59 && Integer.parseInt(c) >= 0 && Integer.parseInt(c) <= 59) {
            count++;
        }
        
        if (Integer.parseInt(a) >= 1 && Integer.parseInt(a) <= 12 && Integer.parseInt(c) >= 0 && Integer.parseInt(c) <= 59 && Integer.parseInt(b) >= 0 && Integer.parseInt(b) <= 59) {
            count++;
        }
        
        if (Integer.parseInt(b) >= 1 && Integer.parseInt(b) <= 12 && Integer.parseInt(a) >= 0 && Integer.parseInt(a) <= 59 && Integer.parseInt(c) >= 0 && Integer.parseInt(c) <= 59) {
            count++;
        }
        
        if (Integer.parseInt(b) >= 1 && Integer.parseInt(b) <= 12 && Integer.parseInt(c) >= 0 && Integer.parseInt(c) <= 59 && Integer.parseInt(a) >= 0 && Integer.parseInt(a) <= 59) {
            count++;
        }
        
        if (Integer.parseInt(c) >= 1 && Integer.parseInt(c) <= 12 && Integer.parseInt(a) >= 0 && Integer.parseInt(a) <= 59 && Integer.parseInt(b) >= 0 && Integer.parseInt(b) <= 59) {
            count++;
        }
        
        if (Integer.parseInt(c) >= 1 && Integer.parseInt(c) <= 12 && Integer.parseInt(b) >= 0 && Integer.parseInt(b) <= 59 && Integer.parseInt(a) >= 0 && Integer.parseInt(a) <= 59) {
            count++;
        }
        
        System.out.println(count);
    }
}
