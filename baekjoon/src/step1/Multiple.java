package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] num = str.split(" ");
		int A = Integer.parseInt(num[0]);
		int B = Integer.parseInt(num[1]);
		
		System.out.println(A*B);
		
		br.close();		
	}

}
