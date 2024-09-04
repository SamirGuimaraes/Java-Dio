/*
 * Modifique o exercício 3 de forma que o conteúdo de vet1 seja copiado para vet2 de forma invertida.
 * Veja o exemplo:
 * 
 * Vetor Original
 * 1-5-0-4-9
 * 
 * Vetor Invertido
 * 9-4-0-5-1 
 */

package ExercEstruturaFluxo;
import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o " +(i+1)+ "º número: ");
            vet1[i] = sc.nextInt();

        }
        sc.close();

        int j = vet1.length - 1;
        for (int i = 0; i < 5; i++){
            vet2[i] = vet1[j];
            j--;
        }

        System.out.println("\nVetor original- ");
        for (int i = 0; i < 5; i++){
            System.out.print(vet1[i] + " ");
        }

        System.out.println("\nVetor invertido- ");
        for (int i = 0; i < 5; i++){
            System.out.print(vet2[i] + " ");
        }

    }
}
