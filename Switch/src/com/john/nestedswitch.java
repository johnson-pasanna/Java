package com.john;

import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //input an employee ID
        int empID = in.nextInt();
        //department
        String department = in.next();

        switch (empID){
            case 1 :
                System.out.println("john");
                break;
            case 2 :
                System.out.println("kkkkkkk");
                break;
            case 3 :
                //switch inside switch
                System.out.println("employee ID 3");
                switch (department){
                    case "IT":
                        System.out.println("It stream");
                    break;
                    case "management":
                        System.out.println("management stream");
                        break;
                    case "mechanical":
                        System.out.println("Royal mech");
                        break;
                    default:
                        System.out.println("no department entered");
                }
                break;
            default:
                System.out.println("no id entered");
        }
    }
}
