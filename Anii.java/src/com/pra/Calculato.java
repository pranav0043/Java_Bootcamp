package com.pra;
import java.util.*;

public class Calculato {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = in.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();

            double result;

            switch (operator) {

                case '+':
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case '/':
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                    break;

                default:
                    System.out.println("Invalid Operator");
            }
        }
    }
