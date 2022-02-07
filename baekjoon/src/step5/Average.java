package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] score = new int[N];
		
		for(int i=0; i<N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(score);
		double sum = 0;
		for(double avg : score) {
			sum += avg/score[N-1]*100;
		}
		
		System.out.println(sum/N);
	}

}
