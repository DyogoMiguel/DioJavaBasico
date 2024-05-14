import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String agencia;
        String nomeCliente;
        int numero;
        double saldo;
        Scanner scan = new Scanner (System.in);

        System.out.println("Por favor, digite o número da Agência");
        agencia = scan.nextLine();
        System.out.println("Por favor, digite o seu nome");
        nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o número de sua conta");
        numero = scan.nextInt();
        System.out.println("Por favor, digite o saldo");
        saldo = scan.nextDouble();

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque");
    }
}
