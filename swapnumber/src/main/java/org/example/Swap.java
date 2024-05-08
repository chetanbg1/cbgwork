package org.example;

public class Swap {
    public void swap(int a, int b){
        System.out.println("numbers before swaping " + a + " " + b);
//        int temp = a;
//        a=b;
//        b=temp;

//        a = a+b;
//        b=a-b;
//        a=a-b;

//        a = a*b;
//        b=a/b;
//        a=a/b;

//        a=a^b;
//        b=a^b;
//        a=a^b;

        b = a+b - (a=b);
        System.out.println("numbers after swaping " + a + " " + b);
    }
}
