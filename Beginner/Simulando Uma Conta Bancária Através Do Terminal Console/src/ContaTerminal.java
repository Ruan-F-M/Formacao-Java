import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int Numero = 1021;
//        String Agencia = "067-8";
//        String NomeCliente = "MARIO ANDRADE";
        double Saldo = 237.48;

        System.out.println("Por favor, digite o seu nome !");
        String NomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta !");
        int Numero = scanner.nextInt();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + Agencia + ", conta " + Numero + " e o seu saldo " + Saldo + " já está disponível para saque.");

    }
}
