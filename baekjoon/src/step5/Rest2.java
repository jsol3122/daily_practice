package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Rest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> rest = new HashSet<>();
		
		for(int i=0; i<10; i++) {
			int num = Integer.parseInt(br.readLine()) % 42;
			rest.add(num);
		}
		
		System.out.println(rest.size());
	}

}
