import java.util.Scanner;

public class contaTerminal {

    public String agencia;
    public String nomeCliente;
    public double saldo;

    public static void main(String[] args) {
        Scanner leitorStr = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = leitorNum.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = leitorStr.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = leitorStr.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = leitorNum.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
