import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.length() > 80) System.out.print("문자열의 최대 길이는 80 bytes 입니다.");
		
		// String 문자열을 char 배열로 바꿈
		char[] parts = input.toCharArray();
		
		for(int i = 0; i < parts.length; i++)
		{
			if (Character.isLowerCase(parts[i])) {
				System.out.print(Character.toUpperCase(parts[i]));
			} else {
				System.out.print(parts[i]);
			}
		}
	}
}