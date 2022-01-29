package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divide {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(str.nextToken());
		double B = Double.parseDouble(str.nextToken());
		
		System.out.println(A/B);
		br.close();
	}

}
