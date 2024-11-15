import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
//		월은 1 이상 12 이하의 정수이다. 각 달의 마지막 날짜는 다음과 같다.
//
//		1/31, 2/28, 3/31, 4/30, 5/31, 6/30, 7/31, 8/31, 9/30, 10/31, 11/30, 12/31
//
//		두 번째 날짜가 첫 번째 날짜보다 항상 크게 주어진다.

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		sc.nextLine();

		for (int test_case = 1; test_case <= T; test_case++) {
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();
			int month2 = sc.nextInt();
			int day2 = sc.nextInt();

			// 예외처리
			if (month1 > month2 || month1 < 1 || month1 > 12 || month2 < 1 || month2 > 12) {
				System.out.println("월을 입력하는 부분은 1 이상 12 이하의 숫자만 입력 가능합니다.");
			}

			int whatDay = 0;
			switch (month1) {
			case 2:
				whatDay += 28 -day1 +1;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				whatDay += 30-day1 +1;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				whatDay += 31-day1 +1;
				break;
			}
			
			
			while (month1+1 <= month2) {
				if (month1+1 == month2) {
					whatDay += day2;
				} else if(month1+1 < month2){
					switch (month1+1) {
					case 2:
						whatDay += 28;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						whatDay += 30;
						break;
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						whatDay += 31;
						break;
					}
				}

				month1++;
			}
			System.out.println("#" + test_case + " " + whatDay);
		}

		sc.close();
	}
}