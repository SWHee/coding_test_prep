import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		sc.nextLine();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			if (N < 3 || N > 20 || M < 3 || M > 20) {
				System.out.println("길이 N,M 은 3 이상 20 이하의 숫자만 입력 가능합니다.");
			}

			int[] Ai = new int[N];
			int[] Bj = new int[M];

			for (int i = 0; i < N; i++) {
				Ai[i] = sc.nextInt();
			}

			for (int i = 0; i < M; i++) {
				Bj[i] = sc.nextInt();
			}

			// 알고리즘
			int maxSum = 0;
			if (N < M) {
				// A가 더 짧고 B가 더 긴 경우
				for (int i = 0; i <= M - N; i++) {
					int currentSum = 0;
					for (int j = 0; j < N; j++) {
						currentSum += Ai[j] * Bj[j + i];
					}
					maxSum = Math.max(maxSum, currentSum);
				}
			} else {
				// B가 더 짧고 A가 더 긴 경우
				for (int i = 0; i <= N - M; i++) {
					int currentSum = 0;
					for (int j = 0; j < M; j++) {
						currentSum += Ai[j + i] * Bj[j];
					}
					maxSum = Math.max(maxSum, currentSum);
				}
			}

			System.out.println("#" + test_case + " " + maxSum);
		}
		sc.close();
	}
}