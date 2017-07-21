package collection;

import java.util.*;

public class Arrayexample {
	public static void main(String[] args) {
		ArrayList arrlst = new ArrayList();
		arrlst.add("hello");
		arrlst.add(54);
		arrlst.add(54);
		arrlst.add(99);
		arrlst.add(50);
		arrlst.add("54");
		arrlst.add(90);
		System.out.println(arrlst);
		arrlst.remove(5);
		arrlst.add(4, 9);
		System.out.println(arrlst);
		//arrlst.removeRange(2,3);
		int size=arrlst.size();
		System.out.println("size of array"+size);
		Object[] ob = arrlst.toArray();
		for (Object value : ob) {
			System.out.println(value);
			int r = arrlst.lastIndexOf("hello");}
				}
	}


