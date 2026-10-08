import java.util.Scanner;// Impotando a classe Scanner
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner.
        Scanner scanner = new Scanner(System.in);

        //Exibir as menssagens para o usuário.
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();// Lê  uma linha de texto.

        System.out.print("Digite o numero de sua Agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();// Lê uma linha de numro inteiro.

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble(); // Lê uma linha de numero decimal
        //Obter pela scanner os valores gigitados no termminal.

        //Exibir a menssagem conta criada.
        System.out.println("Óla " + nome + ", obrigado por ciar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu salfo de " + saldo + " já esta disponivel para saque");

    }
}
