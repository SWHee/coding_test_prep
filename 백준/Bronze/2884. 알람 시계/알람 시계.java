import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
//      0시에서 45분 뺏을 때 23시로 넘어가야 하는 경우
//      30 - 45 = 45 인 것처럼 0과 60 사이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] time = br.readLine().split(" ");
        int H = Integer.parseInt(time[0]);
        int M = Integer.parseInt(time[1]);

        if (M - 45 >= 0){
            System.out.println(H + " " + (M - 45));
        } else if (M - 45 < 0) {
            M = Math.abs(60 + (M - 45));
            if (H - 1 >= 0) {
                System.out.println((H - 1) + " " + M);
            } else if (H - 1 < 0){
                System.out.println("23" + " " + M);
            }
        }
    }
}
