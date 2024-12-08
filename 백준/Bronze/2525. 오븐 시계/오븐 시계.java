import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
//      첫째줄에 시간 분
//      둘째줄에는 몇분이 걸리는지.
//      분끼리 더해서 60이 초과할 경우 (더한 값) / 60 만큼 시간에 더해주고, 나머지는 분으로 출력
//      시간에서 23시에서 0으로 넘어가는 경우도 포함. (hour + (더한 값) / 60) / 24가 1이 넘어가는 경우

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int cookMin = Integer.parseInt(br.readLine());
        int sumMin = min + cookMin;

        if (sumMin / 60 < 1){
            System.out.println(hour + " " + sumMin);
        } else {
            if (hour + (sumMin / 60) < 24) {
                System.out.println(hour + (sumMin / 60) + " " + sumMin % 60);
            } else {
                System.out.println(hour + (sumMin / 60) - 24 + " " + sumMin % 60);
            }
        }
    }
}
