package com.xingej.javaCollection.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * 目的：求两个List列表的差集
 * 
 */
public class Main {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list1.add("192.168.30.11");
		list1.add("192.168.30.12");
		list1.add("192.168.30.13");
		list1.add("192.168.30.14");

		list2.add("192.168.30.10");

		// flag 为true，说明，两个集合有交集
		// flag 为false，说明，两个集合有没有交集
		boolean flag = list1.removeAll(list2);

		System.out.println(flag);

		for (String ip : list1) {
			System.out.println(ip);
		}

	}
}
