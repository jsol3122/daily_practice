package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Rest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = new String[10];
		for(int i=0; i<10; i++) {
			num[i] = (Integer.parseInt(br.readLine()) % 42)+"";
		}
		
		ArrayList<String> list = new ArrayList<>();
		for(String data : num) {
			if(!list.contains(data)) list.add(data); 
		}
		
		System.out.println(list.size());
	}

}
