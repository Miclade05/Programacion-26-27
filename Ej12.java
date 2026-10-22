import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce las horas: ");
        int horas = scanner.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Introduce los segundos: ");
        int segundos = scanner.nextInt();

        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("El total equivalente es: " + totalSegundos + " segundos.");

        scanner.close();
    }
}