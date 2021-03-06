package com.algorithm.chapter1;

//一般而言，对于包含n个元素的列表，用二分查
//找最多需要log2n步，而简单查找最多需要n步。

public class BinarySearchDemo1 {



    public static void main(String[] args) {

    int[] backet= new int[1000];
    for(int i=0;i<1000;i++){
        backet[i]=i;
    }

       System.out.println("location is : "+findValByBinarySearch(backet,0,backet.length-1,10));

    }

    /**
     *
     * @param arr
     * @param low
     * @param high
     * @param target
     * @return
     */
    public static int findValByBinarySearch(int[] arr,int low, int high, int target){

        int left=low, right=high, mid=(low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(left<right){
            if(target<arr[mid]){
                return findValByBinarySearch(arr,left,mid,target);
            }else if(target>arr[mid]){
                return findValByBinarySearch(arr,mid,right,target);
            }
        }
        return 0;

    }
}
