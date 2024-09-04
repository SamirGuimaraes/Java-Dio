package DesafioContaBanco;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        // TODO: Conhecer e importar o classe Scanner
        // TODO: Obter pela Scanner os valores digitados no terminal 
        // TODO: Exibrir as mensagens para o nosso usuário 
        // TODO: Exibir a mensagem conta criada 

        Scanner sc = new Scanner(System.in);

        System.out.println("Para cadastramento informe seu nome: ");
        String nomeUsuario = sc.nextLine();

        System.out.println("Por favor informe o número da agência: ");
        String numAgencia = sc.nextLine();

        System.out.println("Agora informe o número da conta: ");
        int numConta = sc.nextInt();

        System.out.println("Por último informe quando deseja depositar: ");
        float saldoConta = sc.nextFloat();
        sc.close();
    
        System.out.println("Olá " +nomeUsuario+ ", obrigado por criar uma conta em nosso banco, sua agência é " +numAgencia+ ", conta " +numConta+ " e seu saldo " +saldoConta+ "R$ já está disponível para saque.");
        
    }
}
