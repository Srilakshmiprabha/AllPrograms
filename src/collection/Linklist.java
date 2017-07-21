package collection;

import java.util.*;

public class Linklist {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("hi");
		list.add("buy");
		list.add("apple ");
		list.add(23);
		list.add("hi");
		System.out.println(list);
		list.get(2);
		list.getLast();
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		Iterator iter1 = list.descendingIterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		list.push(3);
		list.remove(4);
		list.remove(2);
		  Object[] array = list.toArray(new Object[6]);
		  for (int i = 0; i < list.size(); i++) {
			   System.out.println("Array:" + array[i]);
			   }

	}

}
