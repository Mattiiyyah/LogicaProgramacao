import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        System.out.println("\n --- ##VERIFICANDNO NÚMERO## ---");
        System.out.print("\n Digite um número qualquer: ");
        numero = leitor.nextInt();

        if(numero > 0) {
            System.out.print("\n O número: " + numero + " é positivo");
        } else if (numero < 0 ) {
            System.out.print("\n O número: " + numero + " é negativo");
        } else {
            System.out.print("\n O número: " + numero + " é zero");
        }

        leitor.close();
        System.exit(0);
    }
}
