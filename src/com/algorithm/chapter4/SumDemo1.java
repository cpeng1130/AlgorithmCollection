package com.algorithm.chapter4;

import java.util.Arrays;

public class SumDemo1 {
    public static void main(String[] args) {
        int [] sum ={2,4,6,8,10};
        System.out.println(buildDemo(sum));
    }

    public static int buildDemo(int []sum){

        if(sum.length==1){
            return sum[0];
        }else{
            int tmp=sum[0];
            int[] a2 = Arrays.copyOfRange(sum, 1, sum.length);
            return sum[0]+buildDemo(a2);
        }
    }
}
