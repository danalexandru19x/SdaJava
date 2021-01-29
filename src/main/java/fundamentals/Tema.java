package fundamentals;

import java.util.Scanner;

public class Tema {

    public void bmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight = ");
        float weight = scanner.nextFloat();
        System.out.print("Height = ");
        float height = scanner.nextFloat();
        float bmi = weight / (height * height);
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI is optimal = " + bmi);
        } else {
            System.out.println("BMI is not optimal = " + bmi);
        }
    }

    public void fizzbuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number");
        for (int x = scanner.nextInt(); x < 100; x++) {
            System.out.println(x);
            if (x % 3 == 0) {
                if (x % 5 == 0) {
                    System.out.print("FizzBuzz");
                } else {
                    System.out.print("fizz");
                }
            } else if (x % 5 == 0) {
                System.out.print("buzz");
            }
        }
    }

    public void prime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int x = scanner.nextInt();
        boolean isPrime;

        for (int i = 2; i < x; i++) {
            isPrime = isPrime(i);
            if (isPrime) {
                System.out.println(i + " ");
            }
        }
    }

    public boolean isPrime (int x){
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int f0 = 0;
        int f1 = 1;
        int f2 = 0;
        for (int i = 2; i < x; i++) {
            f2 = f1+ f0;
            f0 = f1;
            f1 = f2;
        }
        System.out.println(f2);
    }

    public void sumOfDigits (){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        int y;
        while(x>0){
            y = x%10;
            x = x/10;
            sum = sum +y;
        }
        System.out.println("sum is " + sum);
    }

    public void stringEnough(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Text = ?");
        String text = scanner.next();
        int maxSize = 0;
        String maxString = "";
        while (true) {
            if (text.equalsIgnoreCase("Enough!")) {
                if (maxSize == 0) {
                    System.out.println("No text provided");
                    return;
                }
                System.out.println(maxString);
                return;
            }

            if (maxSize < text.length()) {
                maxSize = text.length();
                maxString = text;
            }
            System.out.println("give string");
            text = scanner.next();
        }
    }

    public void percentSpace(){
        Scanner scanner = new Scanner(System.in);

    }
}

