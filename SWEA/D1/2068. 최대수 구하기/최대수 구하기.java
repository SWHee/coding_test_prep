import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        for (int test_case = 1; test_case <= T; test_case++) {
            String[] parts = sc.nextLine().split(" ");
            int maxNum = Integer.parseInt(parts[0]); // 첫 번째 숫자를 최대값으로 초기화

            for (int i = 1; i < parts.length; i++) {
                int currentNum = Integer.parseInt(parts[i]);
                if (currentNum > maxNum) {
                    maxNum = currentNum;
                }
            }

            System.out.println("#" + test_case + " " + maxNum);
        }
    }
}
