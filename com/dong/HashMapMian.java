package com.dong;

import java.util.*;

/**
 * @author liudong 2024/4/27
 */
public class HashMapMian {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        Object put = map.put("key", "value2");
        Object put1 = map.put("key", "value1");
        System.out.println(put);
        System.out.println(put1);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("key" + i);
        }
        list.add("key");
        list.add("key");

        List<String> linkList = new LinkedList<>();
        linkList.add("key");
        linkList.get(0);

    }
}
