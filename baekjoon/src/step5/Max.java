package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[9];
		int order = 0, max = 0;
		
		for(int i=0; i<9; i++) {
			num[i] = Integer.parseInt(br.readLine());
			
			if(num[i] > max) {
				max = num[i];
				order = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(order);
	}

}
