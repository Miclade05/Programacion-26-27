import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de dinero en la caja (€): ");
        double dineroCaja = scanner.nextDouble();

        System.out.print("Cantidad de gastos este mes (€): ");
        double gastos = scanner.nextDouble();

        double dineroRestante = dineroCaja - gastos;
        System.out.println("El dinero restante en la caja es: " + dineroRestante + " €");

        scanner.close();
    }
}