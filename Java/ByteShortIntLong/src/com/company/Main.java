package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinValue);
        System.out.println("Integer Maximum Value = " + myMaxValue);
        System.out.println("Busted MAX value = " + (myMaxValue + 1));
        System.out.println("Busted MIN value = " + (myMinValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue /2 );

        //Primitive Challenge

        byte myNewByte = 23;
        short myNewShort = 55;
        int myNewInt = 1256;
        int myNewTotal = myNewByte + myNewShort + myNewInt;
        long combinedLong = 50000L + (10 * myNewTotal);
        System.out.println(combinedLong);

    }
}
