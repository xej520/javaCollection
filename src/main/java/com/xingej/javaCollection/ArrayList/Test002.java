package com.xingej.javaCollection.ArrayList;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

/**
 * 
 * xingej 为了使用google提供的工具包， 对集合里的元素，进行操作，如对集合里的每个元素进行分割，然后重新组成一个list集合
 * 以后如果遇到这种业务，直接使用工具类，就可以了，没必要自己去实现了，
 *
 */
public class Test002 {
	public static void main(String[] args) {

		List<String> currentList = Lists.newArrayList();

		currentList.add("192.168.30.11|8080");
		currentList.add("192.168.30.12|8083");
		currentList.add("192.168.30.13|8082");
		currentList.add("192.168.30.14|8081");

		List<String> nowList = Lists.newArrayList(Lists.transform(currentList, new Function<String, String>() {

			@Override
			public String apply(String input) {
				return StringUtils.split(input, "|")[0];
			}
		}));

		for (String elem : nowList) {
			System.out.println("------>:\t" + elem);
		}

	}
}
