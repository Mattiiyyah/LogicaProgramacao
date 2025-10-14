import java.util.Scanner;

public class SimuladoPessoa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int N_PESSOA = 3;
        char sexo;
        double salario, soma_salario = 0, media_feminio, media_masculino;
        double maior_salario = 0, menor_salario = Double.MAX_VALUE;
        double soma_salario_f = 0, soma_salario_m = 0;
        double cont_f = 0, cont_m = 0;

        for (int i = 0; i < N_PESSOA; i++) {

            //Validação salario
            do{
                System.out.print("\nDigite o salario: ");
                salario = leitor.nextDouble();
                if(salario <= 0) System.out.println("\nDigite o salário corretamente");
            } while (salario <= 0);

            // Validação do sexo
            do {
                System.out.println("\nDigite [M] - Masculino ou [F] - Feminino:");
                sexo = leitor.next().charAt(0);
                sexo = Character.toUpperCase(sexo); // transforma em maiúscula
                if (sexo != 'M' && sexo != 'F') System.out.println("\nSexo inválido! Digite M ou F.");

            } while (sexo != 'M' && sexo != 'F');

            soma_salario += salario;

            if(sexo == 'F') {
                soma_salario_f += salario;
                cont_f++;
            } else {
                soma_salario_m += salario;
                cont_m++;
            }

            if(salario > maior_salario) maior_salario = salario;
            if(salario < menor_salario) menor_salario = salario;

        }

        System.out.printf("\nA média do salário é: %.2f", soma_salario / N_PESSOA);


        if(cont_f > 0) {
            media_feminio = soma_salario_f / cont_f;
            System.out.printf("\nA média salarial para o sexo feminino é: %.2f", media_feminio);
        } else {
            System.out.print("\nNão a pessoas do sexo feminino");
        }

        if(cont_m > 0) {
            media_masculino = soma_salario_m / cont_m;
            System.out.printf("\nA média salarial para o sexo masculino é: %.2f", media_masculino);
        } else {
            System.out.print("\nNão a pessoas do sexo masculino");
        }

        System.out.println("\nO maior salário é: " + maior_salario);
        System.out.println("O menor salário é: " + menor_salario);

        leitor.close();
        System.exit(0);

    }
}
