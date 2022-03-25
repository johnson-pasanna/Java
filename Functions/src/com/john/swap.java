package com.john;

public class swap {
    public static void main(String[] args){
        int a = 10;
        int b = 30;

//        int temp =a;
//        a =b;
//        b=temp;

        swapTwoNumber(a,b);

        System.out.println(a + "" +b );
    }



    static void swapTwoNumber(int a , int b){
        int temp = a;
        a=b;
        b=temp;
//        return a,b;
    }

}



//
//
//
///




