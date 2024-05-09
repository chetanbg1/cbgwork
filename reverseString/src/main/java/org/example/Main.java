package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // using concatenation string

        String str = "abcd";
        //        int length = str.length();
//
//        for(int i = length-1 ; i >=0; i--){
//            rev = rev + str.charAt(i);
//        }

        // reverse using char array
//        char [] arr = str.toCharArray();
//        int length = arr.length;
//        for(int i = length -1 ; i >= 0 ; i--){
//            rev = rev + arr[i];
//        }

        // using StringBuffer class

      //  StringBuffer sb = new StringBuffer(str);
       // System.out.println(sb.reverse());

        char arr[] = str.toCharArray();
        System.out.println(arr);
        swap(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    private static void swap(char []arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}