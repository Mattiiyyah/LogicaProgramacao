import java.util.Scanner;
public class AnoBissexto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int BISSEXTO = 366, ANO = 365;
        int dias;
        System.out.println("\n---- ##VERIFICANDO ANO BISSEXTO## ----");
        System.out.print("Digite a quantidades de dias que tem o ano: ");
        dias = leitor.nextInt();

        if(dias == BISSEXTO) System.out.print("\nO ano é bissexto: " + dias + " dias");
        else if ( dias != ANO) System.out.print("\nDigite a quantidade dos dias do ano corretamente: " + dias + " dias");
        else System.out.print("\nQue pena o ano não é bissexto: " + dias + " dias");

        leitor.close();
        System.exit(0);
    }
}
