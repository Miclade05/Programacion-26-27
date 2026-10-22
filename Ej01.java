import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int entero = scanner.nextInt();
        System.out.println("El doble es: " + (entero * 2));

        System.out.print("Introduce un número decimal: ");
        double decimal = scanner.nextDouble();
        System.out.println("El resultado de dividirlo entre 10 es: " + (decimal / 10));

        scanner.close();
    }
}