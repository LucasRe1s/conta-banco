import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("-------------------------------");
        System.out.println("Ola, eu sou um simulador de banco.");
        System.out.println("-------------------------------");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Pressione ENTER para iniciar");

        String enter = scanner.nextLine();

        System.out.println("Por favor, digite o número de usuario!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.next();

        double saldo = 0.0;
        boolean inputValido = false;
        while (!inputValido) {
            try {
                System.out.println("Por favor, digite o valor de depósito:");
                saldo = scanner.nextDouble();
                inputValido = true; 
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.nextLine(); 
            }
        }
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +  agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        System.out.println("-------------------------------");
        System.out.println("Volte sempre.");
        System.out.println("-------------------------------");

        scanner.close();
    }
}
