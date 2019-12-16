package app;


import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) throws Exception {
//Declaração das variáveis
//declara um vetor do tipo double com 4 posicoes
        double[] notas = new double[4];
        double somatorio=0,media=0;
        //Instacia de um objeto tipo Scanner para armazenar dados das variaveis
        Scanner scanner=new Scanner(System.in);
        
        //estrutura de repeticao do tipo for que repete ate o tamnenho maximo de 4 
        for (int i=0;i<notas.length;i++){
            //imprime na tela do usuario
            System.out.println("Digite a nota "+(i+1));
            //Armazena as notas na posição para cada evento do loop 
            notas[i] = scanner.nextDouble();
            //concatena os valores de cada nota na variavel somatorio
            somatorio+=notas[i];
        }
        //calculo da media
        media=somatorio/notas.length;
        System.out.println("Media "+ media);
        //fecha a instancia do objeto Scanner
        scanner.close();
        
    }
}