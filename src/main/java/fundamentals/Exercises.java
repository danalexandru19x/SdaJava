package fundamentals;

import java.util.Scanner;

public class Exercises {
    static float pi = (float)Math.PI;
    int x = 10;
    public static void perimeter(){
        Scanner scanner = new Scanner(System.in);
        float r = scanner.nextFloat();

        System.out.println("Perimetrul cercului = " + (pi * 2 * r));
    }
}
