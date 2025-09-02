import java.util.Scanner;

public class AreaTriangulo {
    public static void main (String args[]){
        double l, c, a;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite a largura do triangulo: ");
        l = leitor.nextDouble();
        System.out.print("\nDigite a comprimento do triangulo: ");
        c = leitor.nextDouble();
        a = l * c;
        System.out.print("\nA área do triângulo é: " + a);

        leitor.close();
        System.exit(0);
    }
}
