/*
 * Ler 3 números fracionários do teclado e
 * informar se o primeiro é maior do que a soma
 * dos dois últimos;
 */

package ExercEstruturaFluxo;
import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();
        sc.close();

        if (num1 > (num2 + num3)){
            System.out.println("O primeiro número é maior que a soma dos dois últimos.");

        }else{
            System.out.println("O primeiro número não é maior que a soma dos dois últimos.");

        }
        

    }
}
