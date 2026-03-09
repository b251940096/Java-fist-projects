package lab2;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Эхний тоог оруул: ");
        double a = input.nextDouble();
        System.out.print("Дараагийн тоог оруул: ");
        double b = input.nextDouble();
        
        double arithmetic = (a + b) / 2;
        double geometric = Math.sqrt(a * b);
        
        System.out.println("Арифметик дундаж: " + arithmetic);
        System.out.println("Геометр дундаж: " + geometric);
        
        input.close();
    }
}