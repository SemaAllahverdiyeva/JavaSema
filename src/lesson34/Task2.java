package lesson34;

public class Task2 {
	public static void main(String[] args) {
		String text = "Mənim kodum sənin kodundan yaxşıdır. Mən kodu yaxşı yazıram.";
		int count = text.split("kod").length - 1;
		System.out.println(count);
		System.out.println(text.indexOf("kod"));
		System.out.println(text.lastIndexOf("kod"));
	}
}
