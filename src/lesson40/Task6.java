package lesson40;

public class Task6 {
	public static void main(String[] args) {
		TypeClass t1 = new TypeClass("0", false);
		TypeClass t2 = new TypeClass(1, true);
		TypeClass t3 = new TypeClass("true", 1);

		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t2.a);
		System.out.println(t2.b);
		System.out.println(t3.a);
		System.out.println(t3.b);
	}
}
