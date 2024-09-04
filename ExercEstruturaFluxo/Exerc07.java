/*
 * Colocar estas duas linhas iniciais no método Main():
 * - Random rnd = new Random(); //Inicia Aleatório
 * - int x = rnd.nextInt(101); //Gera um número aleatório (0 – 100)
 * 
 * 1. Faça um laço de repetição que solicite ao usuário digitar um número;
 * 2. O laço encerra quando o usuário acertar o número;
 * 3. Se o número do usuário for menor que o oculto,
 * escrever: “MAIOR”, se o número do usuário for maior que
 * o oculto, escrever: “MENOR”.
 * 
 */

package ExercEstruturaFluxo;
import java.util.Random;
import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int numAleatorio = rnd.nextInt(101); 

        Scanner sc = new Scanner(System.in);

        System.out.println("Um número de 0 até 100 foi gerado aleatório pelo computado.");
        System.out.println("Teste sua sorte e escolha um número de 0 a 100: ");
        int numEscolhido = sc.nextInt();

        while(numEscolhido != numAleatorio){
            if (numEscolhido > numAleatorio){
                System.out.println("\nSeu número escolhido é maior que o gerado pelo computador.");
                System.out.println("Teste novamente sua sorte e escolha um número de 0 a 100: ");
                numEscolhido = sc.nextInt();

            }else{
                System.out.println("\nSeu número escolhido é menor que o gerado pelo computador.");
                System.out.println("Teste novamente sua sorte e escolha um número de 0 a 100: ");
                numEscolhido = sc.nextInt();
            }

        }
        sc.close();

        System.out.println("Parabéns! Você e o computador escolher o número: " +numEscolhido);

    }
}
