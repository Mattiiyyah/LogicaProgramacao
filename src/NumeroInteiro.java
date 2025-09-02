import java.util.Scanner;
public class NumeroInteiro {
    public static void main(String args[]) {
        int numero, dobro, metade, quadrado, cubo;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite um número: ");
        numero = leitor.nextInt();
        dobro = numero * 2;
        metade = numero / 2;
        quadrado = numero * numero;
        cubo = numero * numero * numero;
        System.out.print("\nO dobro do número é: " + dobro);
        System.out.print("\nA metade do número é: " + metade);
        System.out.print("\nO quadrado do número é: " + quadrado);
        System.out.print("\nO cubo do número é: " + cubo);

        leitor.close();
        System.exit(0);

    }
}
