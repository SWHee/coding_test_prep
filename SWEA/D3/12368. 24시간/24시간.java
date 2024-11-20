import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if (A < 0 || B < 0 || A > 23 || B > 23) {
                System.out.println("A, B 는 0 이상 23 이하의 숫자만 입력 가능합니다.");
                return;
            }
            
            int currentTime = 0 + A + B;
            System.out.println("#" + test_case + " " + (currentTime % 24));
        }

        sc.close();
    }
}