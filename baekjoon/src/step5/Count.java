package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[10];
		int input = Integer.parseInt(br.readLine()) 
				* Integer.parseInt(br.readLine()) 
				* Integer.parseInt(br.readLine());
		
		String str = String.valueOf(input);
		for(int i=0; i<str.length(); i++) {
			num[(str.charAt(i)) - '0']++;
		}
		
		for(int x : num) {
			System.out.println(x);
		}
	}
}
