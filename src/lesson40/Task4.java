package lesson40;

import java.util.HashSet;
import java.util.TreeSet;

public class Task4 {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String c= "c";
		String c1 = "c";
		String e = "e";
		HashSet<String> hashSet =  new HashSet<>();
		
		hashSet.add(a);
		hashSet.add(b);
		hashSet.add(c);
		hashSet.add(c1);
		hashSet.add(e);
		
        for (String s : hashSet) {
            System.out.println(s);
        }
		
		Integer a1 = 7;
		Integer b1 = 75;
		Integer c2 = 21;
		Integer d1 = 21;
		Integer e1 = 17;
		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(a1);
		treeSet.add(b1);
		treeSet.add(c2);
		treeSet.add(d1);
		treeSet.add(e1);
		
        for (Integer i : treeSet) {
            System.out.println(i);
        }
	}
}
