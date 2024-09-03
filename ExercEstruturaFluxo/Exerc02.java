/*
 * Calcular a multa: Leia a velocidade de um carro
 * e a velocidade máxima para a rua:
 * 
 * 1. Informe 50 reais se estiver até 10km/h acima;
 * 2. Informe 100 reais se estiver entre 11km/h e 30km/ acima;
 * 3. Informe 300 reais se estiver acima de 31km/h acima;
 * 
 */

package ExercEstruturaFluxo;
import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a velocidade máxima da rodovia: ");
        int velRodovia = sc.nextInt();

        System.out.println("Informe a velocidade do carro: ");
        int velCarro = sc.nextInt();
        sc.close();

        int velAcima;

        velAcima = (velCarro - velRodovia);

        if (velAcima <= 10){
            System.out.println("Multa de 50.00R$ por ultrapassar até 10KM/H");

        }else if (velAcima >= 11 && velAcima <=  30){
            System.out.println("Multa de 100.00R$ por ultrapassa de 11KM/H até 30KM/H");

        }else{
            System.out.println("Multa de 300.00R$ por ultrapassar mais de 31KM/H");
        }

    }
}
