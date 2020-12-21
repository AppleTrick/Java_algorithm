package back_4while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class B10952 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while (true) {
			String input = br.readLine();
			String[] result = input.split(" ");
			int a = Integer.parseInt(result[0]);
			int b = Integer.parseInt(result[1]);
			int c = a + b;
			if (c == 0) {
				break;
			} else {
				bw.write(c+"\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
