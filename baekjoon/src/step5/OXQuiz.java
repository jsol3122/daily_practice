package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OXQuiz {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] score = new int[N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), "X");
			int cnt = st.countTokens();
			for(int j=0; j<cnt; j++) {
				int size = st.nextToken().length();
				for(int k=1; k<=size; k++) {
					score[i] += k;
				}
			}
		}
		
		for(int num : score) {
			System.out.println(num);
		}
	}

}
