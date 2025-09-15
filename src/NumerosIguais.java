import java.util.Scanner;

public class NumerosIguais {
    public static void main(String args[]) {
        double n1, n2;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite o primeiro número: ");
        n1 = leitor.nextDouble();
        System.out.print("\nDigite o segundo número: ");
        n2 = leitor.nextDouble();

        if(n1 == n2) System.out.print("\nOs números são iguais");
        else System.out.print("\nOs números são diferentes");
        
        leitor.close();
        System.exit(0);
    }
}
