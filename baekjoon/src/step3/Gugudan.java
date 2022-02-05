package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		for(int i=1; i<10; i++) {
			System.out.println(x+" * "+i+" = "+x*i);
		}
		
		br.close();
	}

}
