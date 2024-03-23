//Составить программу вычисления значений функции y = f(x) при произвольных значениях x.
// Получить результат работы программы для двух заданных значений x. Варианты заданий ниже
import java.util.Scanner;

public class FunctionCalculator {

    public static double calculateY(double x, double a, double b) {
        if (x > 3) {
            return (a + x) * Math.atan(a * x);
        } else {
            return Math.pow(Math.cos(b + Math.pow(x, 3)), 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        double y = calculateY(x, a, b);
        System.out.println("При x = " + x + ", y = " + y);

        scanner.close();
    }
}