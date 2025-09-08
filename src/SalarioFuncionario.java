import java.util.Scanner;
public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double  fgts = 0.08, inss = 0.11, acrescimo = 0.2;
        String cargo;
        double salario_bruto, salario_liquido, valor_fgts, valor_inss, salario_bonus;
        System.out.println("------------------------------");
        System.out.println("Calculo Salário do funcionario");
        System.out.println("------------------------------");

        System.out.print("\nDigite seu cargo: ");
        cargo = leitor.next();
        System.out.print("\nDigite o salário bruto: ");
        salario_bruto = leitor.nextDouble();

        valor_fgts = salario_bruto * fgts;
        valor_inss = salario_bruto * inss;
        salario_liquido = salario_bruto - valor_inss;

        System.out.printf("Salário bruto: %.2f%n", salario_bruto);
        System.out.printf("Depósito FGTS: %.2f%n", valor_fgts);
        System.out.printf("Desconto INSS: %.2f%n", valor_inss);
        System.out.printf("Salário líquido: %.2f%n", salario_liquido);

        if(cargo.equalsIgnoreCase("Professor") || cargo.equalsIgnoreCase("professor")) {
            salario_bonus = salario_liquido + (salario_liquido * acrescimo);
            System.out.println("\nO valor bônus para professor é: " + salario_bonus);
        } else {
            System.out.println("\nSem bônus cargos diferentes");
        }

        leitor.close();
        System.exit(0);

    }
}
