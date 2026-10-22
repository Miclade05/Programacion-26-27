import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Precio del producto (€): ");
        double precioInicial = scanner.nextDouble();

        System.out.print("Porcentaje de descuento (%): ");
        double porcentajeDescuento = scanner.nextDouble();

        double descuento = precioInicial * (porcentajeDescuento / 100);
        double precioFinal = precioInicial - descuento;

        System.out.println("Cantidad descontada: " + descuento + " €");
        System.out.println("Precio final: " + precioFinal + " €");

        scanner.close();
    }
}