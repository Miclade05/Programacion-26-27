import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double KM_POR_MILLA = 1.609;

        System.out.print("Introduce la distancia en kilómetros: ");
        double km = scanner.nextDouble();

        double millas = km / KM_POR_MILLA;
        System.out.println(km + " km equivalen a " + millas + " millas.");

        scanner.close();
    }
}