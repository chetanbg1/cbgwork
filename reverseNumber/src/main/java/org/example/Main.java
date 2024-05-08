package org.example;

import java.util.*;
import java.lang.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();

        //logic 1

//        int rev = 0;
//        while (num != 0){
//            rev =  rev *10 + num % 10;
//            num = num /10;
//        }

        // logic 2 using stringbuffer

//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();

        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();


        System.out.println("reverse number id : "+ rev);
    }
}