package lesson40;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		Integer a = 7;
		Integer b = 75;
		Integer c = 57;
		Integer d = 21;
		Integer e = 17;
		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.remove(b);
		list.remove(c);
		
        for (Integer f : list) {
            System.out.println(f);
        }
	}
}
