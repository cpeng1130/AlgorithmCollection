package com.algorithm.chapter5;


import java.util.HashMap;

public class HashTableDemo1 {

    public static void main(String[] args) {
       HashMap hm= new HashMap<String, String>();
        hm.put("1","a");
        hm.put("2","b");
        hm.put("3","c");
        hm.put("4","d");
        hm.put("5","e");
        hm.put("6","f");
        hm.put("7","g");
        System.out.println(hm.get("5"));
    }
}
