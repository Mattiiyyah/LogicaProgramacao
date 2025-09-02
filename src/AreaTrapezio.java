import java.util.Scanner;
public class AreaTrapezio {
    public static void main(String args[]) {
        double baseMaior, baseMenor, altura, area;
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n--- Calculando Área do Trapézio ---");
        System.out.print("\nDigite o valor da base maior: ");
        baseMaior = leitor.nextDouble();
        System.out.print("\nDigite o valor da base menor: ");
        baseMenor = leitor.nextDouble();
        System.out.print("\nDigite o valor da altura: ");
        altura = leitor.nextDouble();
        area = (baseMaior + baseMenor) * altura / 2;
        System.out.print("\nO valor da área do trapézio é: " + area);

        leitor.close();
        System.exit(0);
    }
}
