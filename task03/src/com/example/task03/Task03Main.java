package com.example.task03;


import java.util.stream.Stream;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(1.23424, 1.345345);
        ComplexNumber number2 = new ComplexNumber(2.23424, 2.345345);
        ComplexNumber addedNumber = number1.add(number2);
        ComplexNumber multipliedNumber = number1.multiply(number2);
        System.out.println(addedNumber.toString());
        System.out.print(multipliedNumber.toString());

    }
}
