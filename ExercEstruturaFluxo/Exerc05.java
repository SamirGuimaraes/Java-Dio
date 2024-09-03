/*
 * 
 * Ler 2 valores e perguntar qual operação 
 * aritmética o usuário quer fazer com
 * eles. Usar switch..case. Informar o 
 * resultado da operação.
 * 
 */

package ExercEstruturaFluxo;
import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        System.out.println("Calculadora \n1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão");
        System.out.println("Informe a operação que deseja realizar: ");
        int opcao = sc.nextInt();
        while(opcao < 1 || opcao > 4){
            System.out.println("Calculadora \n1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão");
            System.out.println("Informe a operação que deseja realizar: ");
            opcao = sc.nextInt();
        };
        
        System.out.println("Digite o primeiro número a ser calculado: ");
        float num1 = sc.nextFloat();
        System.out.println("Digite o segundo número a ser calculado: ");
        float num2 = sc.nextFloat();
        sc.close();

        switch(opcao){
            case 1:
                float soma = num1 + num2;
                System.out.println("A soma dos números informados corresponde a " +soma);
                break;
            case 2:
                float subtracao = num1 - num2;
                System.out.println("A subtração dos números informados corresponde a " +subtracao);
                break;
            case 3:
                float multiplicacao = num1 * num2;
                System.out.println("A multiplicação dos números informados corresponde a " +multiplicacao);
                break;
            case 4:
                float divisao = num1 / num2;
                System.out.println("A divisão dos números informados corresponde a " +divisao);
                break;
            default:
                System.out.println("Reinicie o código e escolha a opcao correta.");
                break;
        }
    }
}
