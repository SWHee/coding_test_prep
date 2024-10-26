/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String input = sc.nextLine();
            String[] inputParts = input.split(" ");
            int[] numbers = new int[inputParts.length];
            float avg = 0;
            
            for(int i = 0; i < inputParts.length; i++) {
            	numbers[i] = Integer.parseInt(inputParts[i]);
                if(numbers[i] < 0 || numbers[i] > 10000) System.out.println("0이상 10000 이하의 정수만 입력해주세요.");
            	
                avg += numbers[i];
            }
            
            // 출력
            avg /= numbers.length;
            System.out.println("#" + test_case +" " + Math.round(avg));
		}
	}
}