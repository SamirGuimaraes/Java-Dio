/*
 * Escrever se um ano informado pelo usuário é
 * bissexto ou não. Um ano é bissexto quando é
 * (divisível por 400) ou é (divisível por 4 e não por 100);
 * 
 */

package ExercEstruturaFluxo;
import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano para descobrir se o mesmo é bissexto ou não: ");
        int anoBissexto = sc.nextInt();
        sc.close();

        if ( anoBissexto%400 == 0){
            System.out.println("O ano " +anoBissexto+ " é bissexto!");
        }else if ((anoBissexto%4 == 0) && (anoBissexto%100 != 0)){
            System.out.println("O ano " +anoBissexto+ " é bissexto!");
        }else{
            System.out.println("O ano " +anoBissexto+ " não é bissexto!");
        }

    }
}
