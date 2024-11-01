import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        for (int test_case = 1; test_case <= T; test_case++)
        {
            String dateInput = sc.nextLine().trim();
            
            // 입력된 날짜를 연, 월, 일로 분리
            int year = Integer.parseInt(dateInput.substring(0, 4));
            int month = Integer.parseInt(dateInput.substring(4, 6));
            int day = Integer.parseInt(dateInput.substring(6, 8));

            if (isValidDate(year, month, day)) {
                System.out.printf("#%d %04d/%02d/%02d\n", test_case, year, month, day);
            } else {
                System.out.printf("#%d -1\n", test_case);
            }
        }
        sc.close();
    }

    // 날짜 유효성 검사 메소드
    private static boolean isValidDate(int year, int month, int day) {
        // 월별 일수 정의
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 월이 1~12인지 확인
        if (month < 1 || month > 12) {
            return false;
        }
        // 해당 월의 일수가 올바른지 확인
        if (day < 1 || day > daysInMonth[month]) {
            return false;
        }

        return true;
    }
}
