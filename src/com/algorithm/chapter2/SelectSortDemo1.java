package com.algorithm.chapter2;

public class SelectSortDemo1 {

    public static void main(String[] args) {

        int [] backet =new int[10];
        for(int i=0;i<10;i++){
            backet[i]=(int)(Math.random()*10);
        }
        System.out.println("before");
        for(int tmp: backet){
            System.out.print("  -   " +tmp);
        }
        System.out.println();
        System.out.println("after");
        buildSelectSort(backet);
    }
    public static void buildSelectSort(int [] arr){
        int maxIndex;
        for(int i=0;i<arr.length-1;i++){
            maxIndex=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[maxIndex]<=arr[j]){
                    maxIndex=j;
                }
            }
            swap(arr,i,maxIndex);
        }
        for(int tmp: arr){
            System.out.print("  -   " +tmp);
        }
    }

    public static  void swap(int arr[], int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
