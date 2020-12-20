package back_3for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class B15552 {

	//Scanner와 System.out.println 대신 
	//BufferedReader와 BufferedWriter를 사용할 수 있다.
	//BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new  BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine().trim());
		
		for (int i = 0; i < a; i++) {
			String input = br.readLine();
			String [] result = input.split(" ");
			int b = Integer.parseInt(result[0]);
			int c = Integer.parseInt(result[1]);
			bw.write((b+c)+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
