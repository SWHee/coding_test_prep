import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		sc.nextLine();

		if (T % 2 != 1 || T < 9 || T > 199) {
			System.out.println("N은 9 이상 199 이하의 홀수만 입력 가능합니다.");
		}

		String[] input = sc.nextLine().split(" ");
		int[] numbers = java.util.Arrays.stream(input)
				.mapToInt(Integer::parseInt)
				.toArray();
		Arrays.sort(numbers);

		sc.close();
		System.out.println(numbers[T/2]);
	}
}