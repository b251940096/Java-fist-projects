package lab5;

import java.util.Scanner;

public class Statistics {
    public static double mean(double n1, double n2) {
        return (n1 + n2) / 2;
    }
    public static double mean(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
    public static double mean(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }
    public static double mean(double n1, double n2, double n3, double n4, double n5) {
        return (n1 + n2 + n3 + n4 + n5) / 5;
    }

    public static double mean(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return (numbers.length == 0) ? 0 : sum / numbers.length;
    }

    public static double deviation(double... numbers) {
        double avg = mean(numbers);
        double sumSqDiff = 0; 
        for (double num : numbers) {
            sumSqDiff += Math.pow(num - avg, 2); 
        }
        return Math.sqrt(sumSqDiff / numbers.length); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Heden toon deer statistic uildel guitsetgeh we? ");
        int n = sc.nextInt();    
        
        double a[] = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.printf("%d-р тоог оруул: ", i + 1);
            a[i] = sc.nextDouble();
        }

        System.out.println("\n--- Tootsoolliin ur dun ---");
        System.out.printf("Niit toonuudiin dundaj (VarArgs): %.2f\n", mean(a));
        System.out.printf("Standart hazailt (Deviation): %.2f\n", deviation(a));

        if (n >= 2) {
            System.out.printf("Ehnii 2 toonii dundaj (Overloaded): %.2f\n", mean(a[0], a[1]));
        }
        sc.close();
    }
}