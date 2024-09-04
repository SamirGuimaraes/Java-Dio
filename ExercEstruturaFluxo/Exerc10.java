/*
 * Escrever um main Java que lê 20 números reais e armazena esses valores em um array. O programa
 * deve calcular a média aritmética dos valores do vetor e imprimir todos os valores menores do que a
 * média calculada. 
 * 
 */

package ExercEstruturaFluxo;
import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        
        double[] vetor = new double[10];

        Scanner sc = new Scanner(System.in);
        // For responsável por armazenar os valores digitado
        for (int i = 0; i < 10; i++){
            System.out.println("Informe o " +(i+1)+ "º número: ");
            vetor[i] = sc.nextInt();
        }
        sc.close();

        double somaValores = 0;

        // For responsável por imprimir e somar os valores digitados 
        for (int i = 0; i < 10; i++){
            System.out.println(vetor[i]);
            somaValores += vetor[i];
        }

        double mediaValores;
        mediaValores = somaValores / vetor.length ;
        System.out.println("A soma total corresponde a " +somaValores+ ". \nA média dos valores corresponde a " +mediaValores);

        int contador  = 0;
        //For resposável por verificar se há um valor menor que a média e o armazenar em um vetor secundário 
        for (int i = 0; i < 10; i++){
            if (vetor[i] < mediaValores){
                contador++;
            }
        }

        // if-else que caso haja valores menores menores que a média o vetor secundário é impresso e caso não haja é informado a ausência de valores menores que a média 
        if (contador != 0){
            System.out.println("Esses sãos os números digitados menores que a média: ");
            for (int i = 0; i < 10; i++){
                if (vetor[i] < mediaValores ){
                System.out.print(vetor[i] + " ");
                }
            }
        }else{
            System.out.println("Nenhum valor digitado foi menor que a média.");
        }

    }
}
