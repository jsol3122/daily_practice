package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		
		String num2 = br.readLine();
		String[] xyz = num2.split("");
		
		int x = Integer.parseInt(xyz[0]); // (2)�� ���� �ڸ� ��
		int y = Integer.parseInt(xyz[1]); // (2)�� ���� �ڸ� ��
		int z = Integer.parseInt(xyz[2]); // (2)�� ���� �ڸ� ��
		
		System.out.println(num1*z);
		System.out.println(num1*y);
		System.out.println(num1*x);
		System.out.println(num1*Integer.parseInt(num2));
		
		br.close();
	}

}
