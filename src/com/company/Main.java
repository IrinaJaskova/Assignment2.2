package com.company;

import java.util.Scanner;

public class Main {

    public static void TestResult(char Result) {

        switch (Result) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Input correct grade from A to F");
                break;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your exam result");
        char Result = input.next().charAt(0);

        TestResult(Result);

    }
}
