import java.util.Scanner;

public class RepeticaoPessoas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int N_PESSOAS = 3;
        int idade;
        double peso, altura;
        char sexo;
        int soma_idade = 0;
        double soma_peso = 0, soma_altura = 0;
        int cont_f = 0, cont_m = 0;

        for (int i = 0; i < N_PESSOAS; i++) {
            System.out.println("\nDigite a idade da pessoa: ");
            idade = leitor.nextInt();
            System.out.println("\nDigite a altura da pessoa: ");
            altura = leitor.nextDouble();
            System.out.println("\nDigite o peso da pessoa: ");
            peso = leitor.nextDouble();
            System.out.println("\nDigite [M] - Masculino ou [F] - Feminino: ");
            sexo = leitor.next().charAt(0);

            soma_idade += idade;
            soma_altura += altura;
            soma_peso += peso;

            if(sexo == 'F' || sexo == 'f') cont_f++;
            else cont_m++;
        }

        System.out.print("\nMédia das idades: " + soma_idade / N_PESSOAS);
        System.out.printf("\nMédias dos pesos: %.2f", soma_altura / N_PESSOAS);
        System.out.printf("\nMédias dos pesos: %.2f", soma_peso / N_PESSOAS);
        System.out.print("\nTotal de homens: " + cont_m);
        System.out.print("\nTotal de mulheres: " + cont_f);
        System.out.printf("\nPorcentagem de homens: %.2f", (cont_m * 100.0 / N_PESSOAS) );
        System.out.printf("\nPorcentagem de mulheres: %.2f", (cont_f * 100.0 / N_PESSOAS) );

        leitor.close();
        System.exit(0);
    }
}
