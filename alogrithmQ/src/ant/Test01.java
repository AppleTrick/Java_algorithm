package ant;

import java.util.Scanner;

public class Test01 {
	static StringBuilder Line = new StringBuilder("1");
	static StringBuilder addLine = new StringBuilder();
	static int count = 1;
	static char temp = 0;
	

	public static void main(String[] args) {

		System.out.println("����� ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//�ݺ��ؼ� ����Ѵ�.
		
		
		
		for (int i = 0; i < input; i++) {
			System.out.println(Line);
			temp = Line.charAt(0);
			addLine.append(temp);
			Deduplication();
//			addLine.append(count);
			
			
			
			
		}
		
		
	}
	
	public static void Deduplication() {
		
		for (int i = 0; i < Line.length(); i++) {
			if (i == Line.length()-1) {
				addLine.append(count);
				count = 1;
			} else {
				// �յ� ���� ������ ��
				if (Line.charAt(i)==Line.charAt(i+1)) {
					count ++;
				// �յ� ���� �ٸ� ���
				} else {
					addLine.append(count);
					temp = Line.charAt(i+1);
					addLine.append(temp);
					count = 1;
				}
			}	
		}
		
		
		Line.setLength(0);
		Line.append(addLine);
		addLine.setLength(0);

		//addLine.setLength(0);
	}
}
	

		