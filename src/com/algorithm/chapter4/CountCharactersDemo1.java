package com.algorithm.chapter4;

import java.util.ArrayList;

public class CountCharactersDemo1 {
    static int count=0;
    public static void main(String[] args) {

        ArrayList al= new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            al.add(i);
        }
        buildDemo(al);
        System.out.println(count);
    }
    public static void buildDemo(ArrayList<Integer> al) {
        if (al.isEmpty()) {
            return;
        } else {
           count++;
            al.remove(0);
            buildDemo(al);
        }
    }
}
