package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MoreThanAvg {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			int score[] = new int[number];
			
			for(int j=0; j<number; j++) {
				score[j] = Integer.parseInt(st.nextToken());
			}
			
			double avg = Arrays.stream(score).sum() / score.length;
			double count = 0;
			for(int c : score) {
				if(c > avg) count++;
			}
			
			bw.write(String.format("%.3f",count/number*100)+"%\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
