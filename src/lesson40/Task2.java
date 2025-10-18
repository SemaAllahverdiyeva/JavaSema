package lesson40;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
	public static void main(String[] args) {
		Person p1 = new Person("name1", 0);
		Person p2 = new Person("name1", 0);
		Person p3 = new Person("name3", 0);
		
		List<Person> pList = new ArrayList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        
        for (Person obj : pList) {
            System.out.println(obj);
        }
	}
}
