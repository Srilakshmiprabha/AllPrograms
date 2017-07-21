package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashlink {
	public static void main(String[] args) {
		LinkedHashSet list1 = new LinkedHashSet();
		list1.add(23);
		list1.add("yt");
		list1.add(null);
		list1.add(23);
		list1.add("reni");
		Iterator it1 = list1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

	}
}
