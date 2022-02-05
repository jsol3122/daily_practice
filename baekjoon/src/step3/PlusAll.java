package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlusAll {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			
			if(i != 0) sb.append("\n");
			sb.append(sum);
		}
		
		System.out.println(sb);
		br.close();
	}

}
