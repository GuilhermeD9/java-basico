import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal c1 = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Seja bem vindo ao seu banco!");

        System.out.println("Insira o número da sua conta: ");
        c1.setNumero(scanner.nextInt());

        System.out.println("Agora, insira sua agência: ");
        c1.setAgencia(scanner.next());

        System.out.println("Por favor, insira seu nome: ");
        c1.setNomecli(scanner.next());

        System.out.println("Por fim, digite seu saldo: ");
        c1.setSaldo(scanner.nextDouble());

        System.out.println("Olá " + c1.nomecli + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + c1.agencia + ", conta " + c1.numero + " e seu saldo R$"
                + c1.saldo + " já está disponível para saque.");
    }
}