package com.john;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        String fruit = in.next();
//        Case 1: When a and b are pointing to the same refernece object
//                you will get true
//        String a = "Johnson";
//        String b = "Johnson";
//        System.out.println(a==b);
//        Case 2 : If and b were different oject but the values were same then you
//                can use the equals to check the values are same
//        String a = "Johnson";
//        String b = "Johnson";
//        if(fruit.equals("mango")){
//            System.out.println("king of fruit");
//        }else {
//            // can also add if stament else not needed
//            System.out.println("Nothing");
//        }
////        System.out.println(a==b);

        switch (fruit) {
            case "Mango" -> System.out.println("Kind of fruiths");
            case "Apple" -> System.out.println("A sweet red fruit");
            default -> System.out.println("please enter a valid fruit name");
        }

    }
}


//        switch (fruit){
//                case "Mango":
//                System.out.println("Kind of fruiths");
//                break;
//                case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//default:
//        System.out.println("please enter a valid fruit name");
//        }