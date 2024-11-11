import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		sc.nextLine();
		
		int[] primes = {2, 3, 5, 7, 11};
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			if (N < 2 || N > 10000000) System.out.println("입력 숫자는 2이상 10,000,000 이하여야 합니다.");
			
			int[] exponents = new int[5]; 
            
            for (int i = 0; i < primes.length; i++) {
                int prime = primes[i];
                while (N % prime == 0) {
                    exponents[i]++;  
                    N /= prime;      
                }
            }

            System.out.print("#" + test_case + " ");
            for (int i = 0; i < exponents.length; i++) {
                System.out.print(exponents[i] + " ");
            }
            System.out.println();
			
		}
	}
}