import java.util.Scanner;
public class PremioDivido {
    public static void main(String args[]) {
        //valor da importância 780.000
        final double importancia = 780.000;
        double primeiro, segundo, terceiro, constante, p1, p2, p3;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite os pontos do primeiro ganhador: ");
        primeiro = leitor.nextDouble();
        System.out.print("\nDigite os pontos do segundo ganhador: ");
        segundo = leitor.nextDouble();
        System.out.print("\nDigite os pontos do terceiro ganhador: ");
        terceiro = leitor.nextDouble();
        constante =  importancia / (primeiro + segundo + terceiro);
        p1 = primeiro * constante;
        p2 = segundo * constante;
        p3 = terceiro * constante;
        System.out.printf("\nO primeiro ganhador recebeu: %.2f", p1);
        System.out.printf("\nO segundo ganhador recebeu: %.2f", p2);
        System.out.printf("\nO terceiro ganhador recebeu: %.2f", p3);

        leitor.close();
        System.exit(0);
    }
}