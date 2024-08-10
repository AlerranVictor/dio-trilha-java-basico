import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        int numero;
        String agencia;
        String nome;
        double saldo;

        //Coleta de daados do cliente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome");
        nome = scanner.nextLine();
        System.out.println("Digite o numero da agencia");
        agencia = scanner.nextLine();
        System.out.println("Digite o numero da conta");
        numero = scanner.nextInt();
        System.out.println("Qual valor deseja depositar em sua conta?");
        saldo = scanner.nextDouble();

        //Imprimindo dados
        System.out.println("Olá " + nome + ", obrigado por abrir uma conta em nosso banco. Sua agencia é " + agencia
        + ", conta " + numero + ", e seu saldo de R$ " + saldo + " já está disponivel para saque");

    }
}
