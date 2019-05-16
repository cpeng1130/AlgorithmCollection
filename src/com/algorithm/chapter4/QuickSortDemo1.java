package com.algorithm.chapter4;

public class QuickSortDemo1 {

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
        buildDemo(backet,0,backet.length-1);
        System.out.println();
        System.out.println("after");
        for(int tmp: backet){
            System.out.print("  -   " +tmp);
        }

    }

    public static void buildDemo(int[] arr, int first,int last){
        if(first<last){
            int tmp =buildSubArray(arr, first, last);
            buildDemo(arr,first,tmp-1);
            buildDemo(arr,tmp+1,last);
        }
    }


    public static int buildSubArray(int[] arr ,int first,int last){
        int ll=first, rr=last , pivotVal=arr[ll];
        while(ll<rr) {
            while(ll<rr && arr[rr]>= pivotVal){
                rr--;
            }
            if(ll<rr){
                arr[ll]=arr[rr];
                ll++;
            }
            while(ll<rr && arr[ll]<pivotVal){
                ll++;
            }
            if(ll<rr){
                arr[rr]=arr[ll];
                rr--;
            }
        }
        arr[ll]=pivotVal;
        return ll;
    }
}
