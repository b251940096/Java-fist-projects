package lab2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("A цэгийн координат (x y): ");
        double ax = input.nextDouble(), ay = input.nextDouble();
        System.out.println("B цэгийн координат (x y): ");
        double bx = input.nextDouble(), by = input.nextDouble();
        System.out.println("C цэгийн координат (x y): ");
        double cx = input.nextDouble(), cy = input.nextDouble();
        
        double sideA = Math.sqrt(Math.pow(bx - cx, 2) + Math.pow(by - cy, 2));
        double sideB = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));
        double sideC = Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
        
        double p = (sideA + sideB + sideC) / 2;
        
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        
        System.out.printf("Гурвалжны талбай: %.2f\n", area);
        
        input.close();
    }
}