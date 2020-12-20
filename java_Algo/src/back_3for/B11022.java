package back_3for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B11022 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= a; i++) {
			
			String input = br.readLine();
			String[] result = input.split(" ");
			int b = Integer.parseInt(result[0]);
			int c = Integer.parseInt(result[1]);
			
			bw.write("Case #"+i+": " + b + " + " + c + " = " + (b+c) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
