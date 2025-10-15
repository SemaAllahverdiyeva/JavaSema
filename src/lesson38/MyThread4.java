package lesson38;

public class MyThread4 extends Thread {
	public void run() {
		for (int i = 6; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
