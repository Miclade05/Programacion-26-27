import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECIO_ADULTO = 12.0;
        final double PRECIO_INFANTIL = 8.0;
        final double PRECIO_BEBIDA = 1.5;

        System.out.print("Número de menús de adulto: ");
        int menusAdulto = scanner.nextInt();

        System.out.print("Número de menús infantiles: ");
        int menusInfantiles = scanner.nextInt();

        System.out.print("Número de bebidas: ");
        int bebidas = scanner.nextInt();

        double total = (menusAdulto * PRECIO_ADULTO) + (menusInfantiles * PRECIO_INFANTIL) + (bebidas * PRECIO_BEBIDA);
        System.out.println("Importe total a pagar: " + total + " €");

        System.out.print("Cantidad abonada por el cliente (€): ");
        double abonado = scanner.nextDouble();

        double cambio = abonado - total;
        System.out.println("El cambio a devolver es: " + cambio + " €");

        scanner.close();
    }
}