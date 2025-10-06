import java.util.Scanner;

public class RepeticaoFuncionarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int N_F = 3;
        double salario;
        double soma_salarial = 0;
        char sexo;
        int departamento, cont_d1 = 0, cont_d2 = 0;
        double soma_salario1 = 0, soma_salario2 = 0;
        double maior_salario = 0, menor_salario = Double.MAX_VALUE;
        int cont_f = 0, cont_m = 0;
        double soma_f = 0, soma_m = 0;
        int cont_f1 = 0, cont_f2 = 0, cont_f3 = 0;

        for (int i = 0; i < N_F; i++) {
            System.out.println("\nDigite o salário do funcionario: ");
            salario = leitor.nextDouble();
            System.out.println("\nDigite [M] - Masculino ou [F] - Feminino: ");
            sexo = leitor.next().charAt(0);
            System.out.println("\nDigite o departamento sendo (1 ou 2): ");
            departamento = leitor.nextInt();

            soma_salarial += salario;

            if(sexo == 'f' || sexo == 'F') {
                soma_f += salario;
                cont_f++;
            }
            else {
                soma_m += salario;
                cont_m++;
            }

            if(salario > maior_salario) maior_salario = salario;
            if(salario < menor_salario) menor_salario = salario;

            if(departamento == 1) {
               soma_salario1 += salario;
               cont_d1++;
            } else {
                soma_salario2 += salario;
                cont_d2++;
            }

            if(salario < 1000) cont_f1++;
            else if(salario >= 1000 && salario < 2000) cont_f2++;
            else cont_f3++;
        }

        System.out.println("\n===== RESULTADOS =====");

        System.out.printf("\nA média salarial é: %.2f", soma_salarial / N_F);
        System.out.println("A média salarial para mulheres é: " + soma_f / cont_f);
        System.out.println("A média salarial para homens é: " + soma_m / cont_m);
        System.out.println("O salário mais alto é: " + maior_salario);
        System.out.println("O salário mais baixo é: " + menor_salario);
        System.out.println("Média do salario no departamento 1: " + soma_salario1 / cont_d1);
        System.out.println("Média do salario no departamento 2: " + soma_salario2 / cont_d2);
        System.out.printf("Porcentagem de funcionários com salário até 1000: %.2f", (cont_f1 * 100.0 / N_F));
        System.out.printf("\nPorcentagem de funcionários com salário de 1000 até 2000: %.2f",(cont_f2 * 100.0 / N_F));
        System.out.printf("\nPorcentagem de funcionários com salário acima de 2000: %.2f", (cont_f3 * 100.0 / N_F));


        leitor.close();
        System.exit(0);
    }
}
