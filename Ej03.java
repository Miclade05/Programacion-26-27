import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.1416;

        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        double longitud = 2 * radio * PI;
        System.out.println("La longitud de la circunferencia es: " + longitud);

        scanner.close();
    }
}