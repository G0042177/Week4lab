package ie.atu;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        System.out.println("Addition");
        add();
        System.out.println("Multiplication");
        multiple();
        System.out.println("Subtraction");
        sub();

    public static void add() {
        System.out.println("Please your first  number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
    }

    public static void multiple() {
        System.out.println("Please your first  number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);
    }

        public static void sub() {
            System.out.println("Please your first  number :");
            Scanner inputs = new Scanner(System.in);
            int firstNumber = inputs.nextInt();

            System.out.println("Please your second number :");
            int secondNumber = inputs.nextInt();

            int total = firstNumber - secondNumber;
            System.out.println("The total is " + total);
        }
    }