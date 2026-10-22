import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce a: ");
        double a = scanner.nextDouble();

        System.out.print("Introduce b: ");
        double b = scanner.nextDouble();

        System.out.print("Introduce c: ");
        double c = scanner.nextDouble();

        double discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante < 0) {
            System.out.println("No hay soluciones reales");
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
        }

        scanner.close();
    }
}