import java.util.Scanner;
public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double  FGTS = 0.08, INSS = 0.11, ACRESCIMO = 0.2;
        String cargo;
        double salario_bruto, salario_liquido, valor_fgts, valor_inss, salario_bonus;
        System.out.println("------------------------------");
        System.out.println("Calculo Salário do funcionario");
        System.out.println("------------------------------");

        System.out.print("\nDigite seu cargo: ");
        cargo = leitor.next();
        System.out.print("\nDigite o salário bruto: ");
        salario_bruto = leitor.nextDouble();

        valor_fgts = salario_bruto * FGTS;
        valor_inss = salario_bruto * INSS;
        salario_liquido = salario_bruto - valor_inss;

        System.out.printf("Salário bruto: %.2f%n", salario_bruto);
        System.out.printf("Depósito FGTS: %.2f%n", valor_fgts);
        System.out.printf("Desconto INSS: %.2f%n", valor_inss);
        System.out.printf("Salário líquido: %.2f%n", salario_liquido);

        if(cargo.equalsIgnoreCase("Professor") || cargo.equalsIgnoreCase("professor")) {
            salario_bonus = salario_liquido + (salario_liquido * ACRESCIMO);
            System.out.println("\nO valor bônus para professor é: " + salario_bonus);
        } else {
            System.out.println("\nSem bônus cargos diferentes");
        }

        leitor.close();
        System.exit(0);

    }
}
