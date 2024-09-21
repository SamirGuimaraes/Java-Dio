package DesafioProcessoSeletivo;
import java.util.Scanner;

public class SistemaProcessoSeletivo {

    static String[] candidatos = new String[numCandidatos];
    static double[] salarioPretendido = new double[5];
    static String[] selecionados = new String[5];
    static String[] novaAnalise = new String[5];
    static String[] eliminados = new String[5];



    public static void main(String[] args) {
        

        // Chamando o método para inserção de candidatos
        insercaoCandidatos();
        // Chamando o método para definir resultado dos canditados
        classificarCandidatosPorSalario();
        // Chamando o método para imprimir os resultados dos candidatos
        resultadoEntrevista();
    }

    // Método para inserir os candidatos
    static void insercaoCandidatos(){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("\nCanditado " +(i+1)+ "º informe seu nome: ");
            candidatos[i] = sc.nextLine(); // Acessa o array 'candidatos' diretamente

            System.out.println("Informe o salário pretendido: ");
            salarioPretendido[i] = sc.nextDouble(); 
            sc.nextLine(); // Limpar o buffer 
        }

        sc.close(); // Fechar o scanner após a inserção dos dados
    }

    // Método para imprimir os respectivos resultados dos candidatos
    static void resultadoEntrevista(){

        System.out.println("\nCandidatos selecionados");
        for (int i = 0; i < 5; i++) {
            if (selecionados[i] != null) 
              System.out.println("Candidato " + (i + 1) + ": " + selecionados[i] + " \nSalário: R$ " + salarioPretendido[i]);
            
        }

        System.out.println("\nCandidatos destinados a nova análise");
        for (int i = 0; i < 5; i++) {
            if (novaAnalise[i] != null) 
                System.out.println("Candidato " + (i + 1) + ": " + novaAnalise[i] + " \nSalário: R$ " + salarioPretendido[i]);
            
        }

        System.out.println("\nCandidatos eliminados");
        for (int i = 0; i < 5; i++) {
            if (eliminados[i] != null) 
                System.out.println("Candidato " + (i + 1) + ": " + eliminados[i] + " \nSalário: R$ " + salarioPretendido[i]);
            
         }
    }

    // Método para comparar pretenção salarial do candidato com salário base de 2000
    static void classificarCandidatosPorSalario(){
        double salarioBase = 2000.0;

        for (int i = 0; i < 5; i++){ // For que realiza a comparação salarial e imprime uma respectiva mensagem adequada


            if (salarioPretendido[i] < salarioBase){ 
                selecionados[i] = candidatos[i];

            }else if (salarioPretendido[i] == salarioBase){
                novaAnalise[i] = candidatos[i];

            }else {
                eliminados[i] = candidatos[i];

            }

        }

    }

   
}