package fundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        float r = scanner.nextFloat();
        float pi = (float)Math.PI;
        System.out.println("Perimetrul cercului = " + (pi * 2 * r));
    }
}
