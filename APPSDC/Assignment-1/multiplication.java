package com.tcc.java.programs;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a, b, sum, difference, product, modulo;
        float quotient;

        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take two numbers as input from user
        System.out.println("Enter Two Integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        /* Adding two numbers */
        sum = a + b;
        /* Subtracting two numbers */
        difference = a - b;
        /* Multiplying two numbers */
        product = a * b;
        /* Dividing two numbers by typecasting one operand to float */
        quotient = (float) a / b;
        /* returns remainder of after an integer division */
        modulo = a % b;

        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product : " + product);
        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + modulo);
    }
}