import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine()); // 입력 개수
        boolean[] exists = new boolean[2000001]; // -1,000,000 ~ 1,000,000을 저장 (절댓값 + 1,000,000)

        // 입력 처리
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            exists[num + 1000000] = true; // 존재 여부 표시
        }

        // 오름차순 출력
        for (int i = 0; i <= 2000000; i++) {
            if (exists[i]) {
                bw.write((i - 1000000) + "\n"); // 실제 값으로 변환
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
