import java.util.Scanner;
public class Array_prog2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int TAM = 4;
        final double SAL = 5000.00;
        double[] salarios = new double[TAM];
        double soma_salario = 0, media_salarial;
        double maior_salario = -1, menor_salario = 100000;
        int cont_faixa1 = 0, cont_faixa2 = 0;
        int cont_acima = 0, cont_abaixo = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o salário: " + (i + 1) + " : ");
            salarios[i] = leitor.nextDouble();
            soma_salario += salarios[i];

            if(salarios[i] > maior_salario)
                maior_salario = salarios[i];
            if(salarios[i] < menor_salario)
                menor_salario = salarios[i];

            if(salarios[i] < SAL)
                cont_faixa1++;
            else
                cont_faixa2++;
        }

        media_salarial = soma_salario / TAM;

        for(int i = 0; i < TAM; i++) {
            if(salarios[i] < media_salarial)
                cont_abaixo++;
            else
                cont_acima++;
        }

        System.out.println("\n####  RESULTADOS ####");
        System.out.println("\nA média salarial é: " + media_salarial);
        System.out.println("O maior salário é: " + maior_salario);
        System.out.println("O menor salário é: " + menor_salario);
        System.out.println("% de salários acima de 5000 é " + cont_faixa1 * 1.0 / TAM * 100);
        System.out.println("% de salários superior ou igual a 5000 é: " + cont_faixa2 * 1.0 / TAM * 100);
        System.out.println("% de salários < da MÉDIA SALARIAL é: " + cont_abaixo * 1.0 / TAM * 100);
        System.out.println("% de salários >= da MÉDIA SALARIAL é: " + cont_acima * 1.0 / TAM * 100);

        leitor.close();
        System.exit(0);

    }
}
