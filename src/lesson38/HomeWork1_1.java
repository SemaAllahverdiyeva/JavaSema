package lesson38;

public class HomeWork1_1 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.run();
		t2.run();
	}
}
