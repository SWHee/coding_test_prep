import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine()); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        
  
        int[] divisors = new int[count];
        for (int i = 0; i < count; i++) {
            divisors[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(divisors); 
        int N = divisors[0] * divisors[count - 1];
        
        System.out.println(N);
    }
}
