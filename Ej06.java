import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la temperatura en grados Fahrenheit (°F): ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperatura en Celsius: " + celsius + " °C");

        scanner.close();
    }
}