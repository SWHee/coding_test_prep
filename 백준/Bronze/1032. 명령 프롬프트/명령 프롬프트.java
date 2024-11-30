import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String files[] = new String[N];

		// N개의 파일명 입력받기
		for (int i = 0; i < N; i++) {
			files[i] = br.readLine();
		}

		int nameLength = files[0].length();
		if (nameLength > 50)
			return;

		char[] pattern = files[0].toCharArray();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < nameLength; j++) {
				if (pattern[j] != files[i].charAt(j)) {
					pattern[j] = '?'; // 다르면 '?'로 대체
				}
			}
		}

		System.out.println(new String(pattern));
		br.close();
	}
}