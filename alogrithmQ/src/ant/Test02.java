package ant;

public class Test02 {
	public static void main(String[] args) {
		StringBuilder aa = new StringBuilder("12333");
		StringBuilder bb = new StringBuilder("�ȳ�");
		StringBuilder cc = new StringBuilder();

		System.out.println(aa.hashCode());
		System.out.println(bb.hashCode());
		System.out.println("ab �� ��� " + aa);
		System.out.println("bb �� ��� " + bb);
		System.out.println("cc �� ��� " + cc);
		
		// �ּҰ��� ��ȭ
		cc = aa;
		aa = bb;
		bb = cc;


	
		System.out.println(aa.hashCode());
		System.out.println(bb.hashCode());
		System.out.println("ab �� ��� " + aa);
		System.out.println("bb �� ��� " + bb);
		System.out.println("cc �� ��� " + cc);
		
//		String a = "�ȳ�";
//		String b;
//		b = a;
//		System.out.println(b);
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		a = "�ȳ��ϼ���";
//		System.out.println(b);
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
		
		
	}
}
