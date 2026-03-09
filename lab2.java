package lab2;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Гэрийн радиусыг (R) оруулна уу: ");
        double r = input.nextDouble();
        double busluur = 2 * Math.PI * r;
        
        System.out.printf("Хэрэгцээтэй бүслүүрийн урт: %.2f метр\n", busluur);
        
        input.close();
    }
}


