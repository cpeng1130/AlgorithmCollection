package com.algorithm.chapter3;

public class ResursionDemo1 {

    public static void main(String[] args) {

        System.out.println(buildDemo(4));
    }

    static int buildDemo(int x){
        if(x==1){
            return 1;
        }else {
            return x*(buildDemo(x-1));
        }
    }
}
