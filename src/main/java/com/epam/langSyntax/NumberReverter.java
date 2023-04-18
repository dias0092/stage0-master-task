package com.epam.langSyntax;

public class NumberReverter {
    int reversed = 0;
    public void revert(int number) {
        while(number !=0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /=10;
        }
        System.out.println(reversed);
    }

}
