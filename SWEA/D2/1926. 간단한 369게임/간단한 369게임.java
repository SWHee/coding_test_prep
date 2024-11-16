import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			String number = Integer.toString(i);
			int clapCount = 0;

			for (int j = 0; j < number.length(); j++) {
				char c = number.charAt(j);
				if (c == '3' || c == '6' || c == '9') {
					clapCount++;
				}
			}

			if (clapCount > 0) {
				for (int k = 0; k < clapCount; k++) {
					System.out.print("-");
				}
			} else
				System.out.print(i);
			
			System.out.print(" ");

		}
		sc.close();
	}
}
