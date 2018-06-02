package com.liu.file;

/**
 * 斐波那契数列
 */
public class Rabbit {
    public static void main(String[] args) {
        System.out.println(memecha(12));
    }

    private static int memecha(int month) {
        if (month == 1) return 1;
        if (month == 2) return 1;
        return memecha(month - 1) + memecha(month - 2);
    }
}
