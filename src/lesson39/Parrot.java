package lesson39;

public class Parrot extends Bird {
	public Parrot(String ad, int yas, boolean ucaBilir) {
		super(ad, yas, ucaBilir);
	}

	public String toString() {
		return ad + " " + yas + " " + ucaBilir;
	}

}
