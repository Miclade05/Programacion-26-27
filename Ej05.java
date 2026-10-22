import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double IVA = 0.21;

        System.out.print("Precio por hora (€): ");
        double precioHora = scanner.nextDouble();

        System.out.print("Horas empleadas: ");
        double horas = scanner.nextDouble();

        double subtotal = precioHora * horas;
        double importeIva = subtotal * IVA;
        double total = subtotal + importeIva;

        System.out.println("Subtotal mano de obra: " + subtotal + " €");
        System.out.println("IVA (21%): " + importeIva + " €");
        System.out.println("Total a pagar: " + total + " €");

        scanner.close();
    }
}