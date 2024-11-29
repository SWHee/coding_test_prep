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

			if (A < 1 || B < 1 || A > 20 || B > 20) {
				System.out.println("A, B는 1이상 20 이하의 자연수만 입력 가능합니다.");
				return;
			}

			if (A >= 10 || B >= 10) {
				System.out.println("#" + test_case + " " + "-1");
			} else {
				System.out.println("#" + test_case + " " + A * B);
			}

		}
		
		sc.close();
	}
}