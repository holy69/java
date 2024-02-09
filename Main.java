import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double x = scanner.nextDouble();
        double c = scanner.nextDouble();


        double y = Math.log(a)*Math.sin(x) + b * (Math.cos(c) * Math.pow(x, 2));
        System.out.println(Math.round(y));
    }
}
