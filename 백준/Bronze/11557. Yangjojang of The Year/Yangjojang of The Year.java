import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            String maxSchool = "";
            int maxConsumption = 0;
            
            for (int n = 0; n < N; n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String school = st.nextToken();
                int consumption = Integer.parseInt(st.nextToken());
                
                if (consumption > maxConsumption) {
                    maxConsumption = consumption;
                    maxSchool = school;
                }
            }
            
            sb.append(maxSchool).append("\n");
        }
        
        System.out.print(sb);
    }
}
