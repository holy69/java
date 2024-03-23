//Составить программу вычисления значений функции.
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите количество итераций: ");
        int iterations = scanner.nextInt();

        double sum = 0.0;

        for (int n = 0; n < iterations; n++) {
            double term = Math.pow(-1, n) * 2 * n * Math.pow(x, 2 * n + 1) / factorial(2 * n + 1);
            sum += term;
        }

        System.out.println("Значение функции при x = " + x + " и " + iterations + " итерациях: " + sum);

        scanner.close();
    }

    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}