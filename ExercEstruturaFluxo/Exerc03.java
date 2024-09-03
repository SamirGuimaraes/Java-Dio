/*
 * Ler 3 valores em qualquer ordem e 
 * escrever eles em ordem decrescente;
 *
 */

package ExercEstruturaFluxo;
import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = sc.nextInt();
        sc.close();

        if (n1 > n2 && n2 > n3){
            System.out.println("Em ordem crescente " +n1+ " - " +n2+ " - " +n3);

        }else if (n1 > n3 && n3 > n2){
            System.out.println("Em ordem crescente " +n1+ " - " +n3+ " - " +n2);

        }else if (n2 > n1 && n1 > n3){
            System.out.println("Em ordem crescente " +n2+ " - " +n1+ " - " +n3);

        }else if (n2 > n3 && n3 > n1){
            System.out.println("Em ordem crescente " +n2+ " - " +n3+ " - " +n1);

        }else if (n3 > n1 && n1 > n2){
            System.out.println("Em ordem crescente " +n3+ " - " +n1+ " - " +n2);

        }else{
            System.out.println("Em ordem crescente " +n3+ " - " +n2+ " - " +n1);

        }

    }
}
