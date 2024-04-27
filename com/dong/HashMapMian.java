package com.dong;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liudong 2024/4/27
 */
public class HashMapMian {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        Object put = map.put("key", "value2");
        System.out.println(put);
    }
}
