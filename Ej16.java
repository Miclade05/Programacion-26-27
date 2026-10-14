import java.util.Scanner;
public class Ej16{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final double IRPF = 0.15;
    System.out.println("Cual es tu salario bruto?");
    double SalarioBruto = sc.nextDouble();
    double SalarioNeto = SalarioBruto - (IRPF * SalarioBruto);
    System.out.println("Tu salario neto es " + SalarioNeto);
    sc.close();

}
}