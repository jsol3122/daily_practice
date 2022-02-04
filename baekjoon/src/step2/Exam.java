package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if(num >= 90) System.out.println("A");
		else if(num >= 80) System.out.println("B");
		else if(num >= 70) System.out.println("C");
		else if(num >= 60) System.out.println("D");
		else System.out.println("F");
		
		br.close();
	}

}
