package com.john;

import java.lang.reflect.Array;

public class input {
    public static void main(String[] args){ //string array
        //Scanner in = new Scanner(System.in);
        int[] beer = new int[5];
        beer[0] =23;
        beer[1] =22;
        beer[2] =21;
        beer[3] =25;
        beer[4] =26;
//        System.out.println(beer[2]);
        // but if the array size was 1000 it would take more time to fill it
        // we can use for loop instead
        // input using for loop

        for(int i=0; i<beer.length; i++){
            System.out.println(beer[i]);
            //beer[i] == input
            //beer[i] == in.nextInt();

            //ELse we can use the forEach loop in the above example we are using the indieses to gettting the item
            //We can get the item directly

//            enhanced for loop
            for(int num: beer){ //for every element in the array print the element
                System.out.println(num + ""); //here num represent the eleent of the array
            }
            //the above is the 2 ways to print to string there is 3rd way
            System.out.println(Array.toString(beer));



        }
    }
}
