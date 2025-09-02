import java.util.Scanner;
public class ConversaoTemperatura {
    public static void main(String args[]) {
        double f, c;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite a temperatura em Fahrenheit: ");
        f = leitor.nextDouble();
        c = (f - 32) / 1.8;
        System.out.print("\nA temperatura em Celsius é: " + c);

        leitor.close();
        System.exit(0);
    }
}
