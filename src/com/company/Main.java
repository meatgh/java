package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("run check ");
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value " + myMinByteValue);
        System.out.println("Byte Max Value " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value " + myMinShortValue);
        System.out.println("Short Max Value " + myMaxShortValue + "\n");

        Integer myMinIntegerValue = Integer.MIN_VALUE;
        Integer myMaxIntegerValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value " + myMinIntegerValue);
        System.out.println("Integer Max Value " + myMaxIntegerValue + "\n");

        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value " + myMinLongValue);
        System.out.println("Long Max Value " + myMaxLongValue + "\n");
    }
}
