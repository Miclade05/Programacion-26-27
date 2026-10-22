import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indica el número de segundos: ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int restoSegundos = totalSegundos % 3600;
        int minutos = restoSegundos / 60;
        int segundos = restoSegundos % 60;

        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");

        scanner.close();
    }
}   