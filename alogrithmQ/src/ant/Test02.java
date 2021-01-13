package ant;

public class Test02 {
	public static void main(String[] args) {
		StringBuilder aa = new StringBuilder("12333");
		StringBuilder bb = new StringBuilder("안녕");
		StringBuilder cc = new StringBuilder();

		System.out.println(aa.hashCode());
		System.out.println(bb.hashCode());
		System.out.println("ab 를 출력 " + aa);
		System.out.println("bb 를 출력 " + bb);
		System.out.println("cc 를 출력 " + cc);
		
		// 주소값을 변화
		cc = aa;
		aa = bb;
		bb = cc;


	
		System.out.println(aa.hashCode());
		System.out.println(bb.hashCode());
		System.out.println("ab 를 출력 " + aa);
		System.out.println("bb 를 출력 " + bb);
		System.out.println("cc 를 출력 " + cc);
		
//		String a = "안녕";
//		String b;
//		b = a;
//		System.out.println(b);
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		a = "안녕하세요";
//		System.out.println(b);
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
		
		
	}
}
