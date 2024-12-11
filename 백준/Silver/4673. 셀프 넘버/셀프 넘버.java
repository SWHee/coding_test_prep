import java.io.IOException;

public class Main {
    public static int d(int n) {
        int sumAll = n;

        while (n > 0) {
            sumAll += n % 10;
            n /= 10;
        }

        return sumAll;
    }
    
    public static void main(String[] args) throws IOException {
//      셀프 함수 = 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수
//      n은 d(n)의 생성자 => n + n의 각 자리수 = d(n)
//
//      10000보다 작거나 같은 생성자가 없는 셀프 넘버를 한 줄에 하나씩 출력

        StringBuilder sb;

        int limit = 10000;

        // 셀프 넘버인지 기록할 배열
        boolean[] hasCreator = new boolean[limit + 1];

        // 생성자 있는 숫자 체크
        for (int i = 1; i < limit; i++) {
            int created = d(i); // d 함수로 인해 생성된 수 created
            if (created <= limit) {
                hasCreator[created] = true;
            }

        }

        for (int i = 1; i <= limit; i++) {
            if (!hasCreator[i]) {
                System.out.println(i);
            }
        }

    }
}
