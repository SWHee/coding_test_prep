import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//      10개의 테스트 케이스
        for (int i = 0; i < 10; i++) {
            int T = Integer.parseInt(br.readLine());
            int[][] arr = new int[100][100];
            int max = Integer.MIN_VALUE;

//          2차원 배열에 값 대입
            for (int j = 0; j < 100; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 100; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            
//          row,col 계산
            for (int j = 0; j < 100; j++) {
                int sumRow = 0;
                int sumCol = 0;
                
                for(int k = 0; k < 100; k++) {
                    sumRow += arr[j][k];
                    sumCol += arr[k][j];
                    if(sumRow > max) max = sumRow;
                    if(sumCol > max) max = sumCol;
                }
            }
            
//          오른쪽 아래 대각선
            int sumRightDown = 0;
            for(int j = 0; j < 100; j++) {
                sumRightDown += arr[j][j];
            }
            if(sumRightDown > max) max = sumRightDown;
            
//          왼쪽 아래 대각선
            int sumLeftDown = 0;
            for(int j = 0; j < 100; j++) {
                sumLeftDown += arr[99 - j][j];
            }
            if(sumLeftDown > max) max = sumLeftDown;
            
            sb.append("#").append(T).append(" ").append(max).append("\n");
        }
        
        System.out.println(sb);
    }
}
