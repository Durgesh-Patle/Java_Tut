// package String_Builder;

import java.util.*;

public class StringBuilder_Class {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("H");

        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");

        // System.out.println(sb);


        // Reverse in the Array.
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i; // 5-1-0;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);


        // System.out.println(sb);

        // // Char At Index 0;
        // System.out.println(sb.charAt(0));

        // System.out.println(sb.length());

        // // set the index to value.
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // sb.insert(3, 'n');
        // System.out.println(sb);


        // sb.insert(0, 'S');
        // System.out.println(sb);

        // // delete the extra n

        // sb.delete(3, 4);
        // System.out.println(sb);
    }
}