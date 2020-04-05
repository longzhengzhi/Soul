package com.longgg.array;

public class Array {

    public static void main(String[] args) {
        int num[] = new int[]{1,2,3,4,5,6,7,8};
        System.out.print("原始数组：");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println();
        delete(3,num);
        System.out.print("改变后的数组：");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }

    public static void delete(int value,int num[]){
        int i=0;
        for (; i < num.length ; i++) {
            if (num[i] == value){
                break;
            }
        }
        System.out.println(i);
        for (int j = i; j < num.length-1; j++) {
            num[j] = num[j+1];
        }
        num[num.length-1]=0;

    }


}
