package com.john;

import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
//        usergreet();
//    }
//
//        static void usergreet(){
////            Scanner in = new Scanner(System.in);
//            System.out.println("hello john");
//
//
//    }
        String persnalised = myGreet("Johnson");
        System.out.println(persnalised);
    }
    static String myGreet(String name){
        String message = "hello" + name;
        return message;

    }


}
