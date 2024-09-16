package day1;

import java.util.ArrayList;

public class test2 {

    public static void main(String[] args) {
        //冒泡排序
        int[] arr={3,4,1,5,2,6,7,8,2,0};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int k : arr) {
            System.out.print(k + ",");
        }
        System.out.println();
        int[] arr2={3,4,1,5,2,6,7,8,2,0};
        for(int i=0;i<arr2.length-1;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[j]<arr2[i]){
                    var temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        for (var j : arr2) {
            System.out.print(j + ",");
        }
    }
}
