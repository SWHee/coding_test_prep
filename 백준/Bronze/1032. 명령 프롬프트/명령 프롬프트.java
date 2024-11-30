import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 기준이 되는 첫번째 기준
		char[] chArray = br.readLine().toCharArray();
		
		// 입력받는 하나의 문자열마다 비교, chArray가 첫번째이므로 i=1부터 시작
		for (int i = 1; i < N; i++) {
			String str = br.readLine();
			int idx = 0; 

			while (idx < chArray.length) {
				if (chArray[idx] != str.charAt(idx)) {
					chArray[idx] = '?';
				}
				idx++;
			}
		}

		System.out.println(new String(chArray));
	}
}