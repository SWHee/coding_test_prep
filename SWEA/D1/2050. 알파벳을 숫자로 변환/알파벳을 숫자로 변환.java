import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] parts = input.toCharArray();
        if (input.length() > 200) System.out.print("문자열의 최대 길이는 200입니다.");
        
        for (int i = 0; i < parts.length; i++) {
        	System.out.print(parts[i]-'A'+1 + " ");
        }
        
        sc.close();
    }
}
