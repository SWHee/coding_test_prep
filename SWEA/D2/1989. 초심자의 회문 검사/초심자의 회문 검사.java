import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            String input = sc.nextLine();
            boolean isPalindrome = checkPalindrome(input);
            
            System.out.println("#" + test_case + " " + (isPalindrome ? 1 : 0));
        }
    }

    private static boolean checkPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
    	}
        return true;
	}
}