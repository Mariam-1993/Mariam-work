package com.company;

public class Main {
    public static void main(String[] args) {
       int[] myArr={80,50,50,40,60,80,100};
       for(int i=0;i<myArr.length; i++){
        for(int j=i+1;j<myArr.length; j++) {
            if(myArr[i]==myArr[j]) {
                System.out.print(myArr[i]);
            }
        }
       }


    }
}