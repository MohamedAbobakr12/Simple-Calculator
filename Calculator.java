package com.mycompany.calculator;

import java.util.Scanner;

public class Calculator {

    static void Addition() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
    }

    static void Subtraction() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 - num2);
    }

    static void Multiplication() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 * num2);
    }

    static void Division() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 / num2);
    }

    public static void main(String[] args) {
        String Operation;
        Scanner sc = new Scanner(System.in);
        Operation = sc.nextLine();
        if (Operation.equals("+")) {
            Addition();
        } else if (Operation.equals("-")) {
            Subtraction();
        } else if (Operation.equals("*")) {
            Multiplication();
        } else if (Operation.equals("/")) {
            Division();
        }

    }
}
