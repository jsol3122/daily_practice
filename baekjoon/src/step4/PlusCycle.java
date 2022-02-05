package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int temp = n;
		
		int count = 0;
		
		while(true) {
			count++;
			
			n = ((n%10)*10) + (((n/10)+(n%10))%10);
			if(temp == n) break;
		}
		
		System.out.println(count);
	}

}
