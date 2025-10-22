package lesson41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class parctica1 {
//	5.
//	Java proqramı yazın ki, iki siyahını bir siyahıya birləşdirsin
//	6.
//	Java proqramı yazın ki, bir siyahının unikal elementlərini saxlayan bir dəst (set)
//	7.
//	Java proqramı yazın ki, bir set də müəyyən bir elementin olub olmadığını yoxlasın
//	8.
//	Java proqramı yazın ki, iki set in birləşməsini və kəsişməsini tapsın.
//	9.
//	Java proqramı yazın ki, bir növbə queue ) yaratsın və ona bəzi elementlər əlavə etsin.
//	10.
//	Java proqramı yazın ki, bir növbədəki bütün elementləri silsin.

	public static void main(String[] args) {
		// 1
		List<String> myFriendList = new ArrayList<>();
		myFriendList.add("aaaaa");

		// 2
		List<String> myStringList = new ArrayList<>();
		myStringList.add("a");
		myStringList.add("b");
		myStringList.add("c");
		myStringList.add("d");
		myStringList.add("e");

		Collections.reverse(myStringList);

		for (String item : myStringList) {
			System.out.println(item);
		}

		// 3
		List<Integer> myNumberList = new ArrayList<>();
		myNumberList.add(1);
		myNumberList.add(2);
		myNumberList.add(3);
		myNumberList.add(4);
		myNumberList.add(5);

		Integer maxNumber = Collections.max(myNumberList);
		System.out.println(maxNumber);

		// 4
		Set<String> myStringList2 = new HashSet<>();
		myStringList2.add("a");
		myStringList2.add("a");
		myStringList2.add("f");
		myStringList2.add("a");
		myStringList2.add("g");
		myStringList2.add("g");
		myStringList2.add("c");
		myStringList2.add("b");
		myStringList2.add("c");
		myStringList2.add("f");
		myStringList2.add("g");
		myStringList2.add("q");
		myStringList2.add("a");
		myStringList2.add("f");

		System.out.println(myStringList2);

		// 5
		List<String> myList = new ArrayList<>();
		List<String> myList2 = new ArrayList<>();

		// 6
		Set<String> uniqueSet = new HashSet<>(myStringList2);
		uniqueSet.add("a");
		uniqueSet.add("m");
		uniqueSet.add("n");
		uniqueSet.add("a");
		uniqueSet.add("m");
		uniqueSet.add("z");
		uniqueSet.add("a");		

		System.out.println(uniqueSet);
	}
}
