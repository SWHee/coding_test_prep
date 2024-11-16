import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int homeCount = sc.nextInt();
			if (homeCount < 4 || homeCount > 1000)
				System.out.println("건물의 개수는 4 이상 1000 이하의 수만 입력 가능합니다.");
			int[] homeHigh = new int[homeCount];
			int provedCount = 0;
			
			int maxSum = Integer.MIN_VALUE;
			int bridge = 0;

			for (int i = 0; i < homeCount; i++) {
				homeHigh[i] = sc.nextInt();
				if (homeHigh[0] != 0 || homeHigh[1] != 0 || homeHigh[homeCount - 2] != 0
						|| homeHigh[homeCount - 1] != 0) {
					System.out.println("첫번째와 두번째, 맨마지막 전과 맨 마지막은 0 만 입력 가능합니다.");
				}
				if (homeHigh[i] < 0 || homeHigh[i] > 255) {
					System.out.println("집 높이는 0 이상 255 이하만 입력 가능합니다.");
				}
			}

			for (int i = 2; i < homeCount - 2; i++) {
				int leftMax = Math.max(homeHigh[i - 2], homeHigh[i - 1]); // 왼쪽 2칸 중 최고
				int rightMax = Math.max(homeHigh[i + 1], homeHigh[i + 2]); // 오른쪽 2칸 중 최고

				if (homeHigh[i] > leftMax && homeHigh[i] > rightMax) {
					maxSum = Math.max(leftMax, rightMax);
					bridge = homeHigh[i] - maxSum;
					provedCount += bridge;
				}
			}
			System.out.println("#" + test_case + " " + provedCount);
		}
		sc.close();

	}

}
