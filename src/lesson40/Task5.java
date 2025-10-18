package lesson40;

public class Task5 {
public static void main(String[] args) {
	UniqeClass u1 = new UniqeClass();
	UniqeClass u2 = new UniqeClass();
	UniqeClass u3 = new UniqeClass(true);
	u1.a = 21;
	u2.a = "variable";
	System.out.println(u1.a);
	System.out.println(u2.a);
	System.out.println(u3.a);
}
}
