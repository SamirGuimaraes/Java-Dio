/*
 * Armazenar um array de 10 números inteiros:
 *  • Solicitar ao usuário que informe cada um destes números; 
 *  ou
 *  • Gerar 10 números aleatórios para o array:
 * 
 * – Random rnd = new Random(); //Inicia Aleatório [Fora do laço]
 * – array[indice]= rnd.nextInt(100); //Gera um número aleatório
 * 
 */

package ExercEstruturaFluxo;
import java.util.Random;
import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha como visualizar 10 números \n1 - Usuário inserir número a número. \n2 - Computador gera 10 números aleatórios.");
        int opcao = sc.nextInt();
        while(opcao != 1 && opcao != 2){
            System.out.println("Escolha como visualizar 10 números \n1 - Usuário inserir número a número. \n2 - Computador gera 10 números aleatórios.");
            opcao = sc.nextInt();
        }

        switch(opcao){
            case 1:
                int[] numUsuario = new int[10];
                for (int i = 0; i < 10; i++){
                    System.out.println("Digite o " +(i+1)+ "º número: ");
                    numUsuario[i] = sc.nextInt();
                }

                for (int i = 0; i < 10; i++){
                    System.out.println("Número " +(i+1)+ "º:" +numUsuario[i]);
                }
                break;

            case 2:
                Random rnd = new Random();
                int[] numGerado = new int[10];

                for (int i = 0; i < 10; i++){
                    numGerado[i] = rnd.nextInt(1001);
                }

                for (int i = 0; i < 10; i++){
                    System.out.println("Número " +(i+1)+ "º:"  +numGerado[i]);

                }
                break;

            default:
                System.out.println("Erro! Reinicialize o código.");
                break;

        }
        sc.close();

    }
}
