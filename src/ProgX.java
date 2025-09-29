import java.util.Scanner;

public class ProgX {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        final int LOOP = 5;
        double salario, soma = 0;
        int idade, somaIdade = 0;
        char sexo; //apenas um caracter masculino ou feminino
        int contF = 0, contM = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Salario " + i + ": ");
            salario = leitor.nextDouble();

            System.out.println("Informe a idade: ");
            idade = leitor.nextInt();

            System.out.println("Informe o sexo: [F] - Feminino ou [M] - Masculino: ");
            sexo = leitor.next().charAt(0);

            soma += salario;
            somaIdade += idade;

            if(sexo == 'f' || sexo == 'F')
                contF++;
            else
                contM++;
        }

        System.out.print("\nMédia Salarial: " + soma / LOOP);
        System.out.print("\nMédia das idades: " + somaIdade / LOOP);
        System.out.print("\nQuantidade de mulheres: " + contF);
        System.out.print("\nQuantidade de homens: " + contM);

        leitor.close();
        System.exit(0);
    }
}
