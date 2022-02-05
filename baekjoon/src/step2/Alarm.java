package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alarm {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int gab = Math.abs(45-M);
		
		if(M < 45) {
			if(H == 0) System.out.println("23 "+(60-gab));
			else System.out.println((H-1)+" "+(60-gab));
		}else {
			System.out.println(H+" "+(M-45));
		}
	}

}
