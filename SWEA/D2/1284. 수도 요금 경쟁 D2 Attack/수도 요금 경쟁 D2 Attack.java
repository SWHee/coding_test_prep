import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
//		A사 => 1리터당 P원
//		B사 => R리터 이하인 경우 기본 Q원, R리터 이상 1리터당 S원 
//		한달 수도의 양 W리터 		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			// A사
			int P = sc.nextInt(); // 리터당 원
			
			// B사
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt(); // 리터당 원
			
			// 한달 사용량
			int W = sc.nextInt();
			
			// 선택 후 최종 납부금액
			int pay = 0;
			
			if (W <= R) {
				if(P > Q) pay = Q;
				else pay = W * P;
			} else if (W > R) {
				pay = Math.min((W-R)*S + Q, W*P);
			}
			
			System.out.println("#" + test_case + " " + pay);

		}
		sc.close();
	}
}