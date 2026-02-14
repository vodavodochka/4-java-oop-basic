package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(this.real + number.real, this.imaginary + number.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(this.real*number.real - this.imaginary * number.imaginary, this.real*number.imaginary+number.real*this.imaginary);
    }

    public String toString() {
        return String.format("real: %f; imaginary: %f", real, imaginary);
    }
}
