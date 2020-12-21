package back_5OneDemensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B4344 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < a; i++) {
			String input = br.readLine();
			String[] result = input.split(" ");
			int count = 0;
			int sum = 0;
			double Avg = 0;
			for (int j = 1; j < result.length; j++) {
				sum = sum + Integer.parseInt(result[j]);
			}
			
			Avg = (double)sum / Double.parseDouble(result[0]);
			
			for (int j = 1; j < result.length; j++) {
				if (Avg < Double.parseDouble(result[j])) {
					count ++;
				}
			}
			
			String s = String.format("%.3f", (double)count/Double.parseDouble(result[0])*100) ;
			
			bw.write(s+"%\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
