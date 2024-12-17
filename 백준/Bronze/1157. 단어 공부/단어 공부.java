import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력된 문자열을 대문자로 변환
        String input = br.readLine().toUpperCase();

        // 알파벳 빈도를 저장할 배열 (A-Z)
        int[] counts = new int[26];

        // 각 알파벳의 빈도 계산
        for (int i = 0; i < input.length(); i++) {
            counts[input.charAt(i) - 'A']++;
        }

        // 최대 빈도 및 해당 알파벳을 찾기
        int mostCount = 0;
        char mostChar = '?'; // 결과값
        boolean isDuplicate = false;

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > mostCount) {
                mostCount = counts[i];
                mostChar = (char) (i + 'A');
                isDuplicate = false; // 중복 초기화
            } else if (counts[i] == mostCount) {
                isDuplicate = true; // 중복 발생
            }
        }

        // 출력
        System.out.println(isDuplicate ? "?" : mostChar);
    }
}
