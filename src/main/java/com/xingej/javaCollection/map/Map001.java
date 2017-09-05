package com.xingej.javaCollection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * xingej 目的：Map集合测试, 根据list列表中的值，来删除Map集合中的kv键值对
 *
 */
public class Map001 {
	public static void main(String[] args) {
		Map<String, String> hostTaskId = new HashMap<String, String>();
		hostTaskId.put("192.168.30.10", "task001");
		hostTaskId.put("192.168.30.11", "task002");
		hostTaskId.put("192.168.30.12", "task003");

		List<String> hosts = new ArrayList<String>();
		hosts.add("192.168.30.10");
		for (String host : hosts) {
			if (hostTaskId.containsKey(host)) {
				// 删除相同的，那么，集合中，剩下的，就是多余的taskId了
				hostTaskId.remove(host);
			}
		}

		for (Map.Entry<String, String> kv : hostTaskId.entrySet()) {
			System.out.println(kv.getKey() + " ---> " + kv.getValue());
		}

	}
}
