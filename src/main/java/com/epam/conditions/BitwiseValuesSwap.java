package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        // XOR bitwise operator to swap the values
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        // Output the swapped values
        System.out.println(first);
        System.out.println(second);
    }

}
