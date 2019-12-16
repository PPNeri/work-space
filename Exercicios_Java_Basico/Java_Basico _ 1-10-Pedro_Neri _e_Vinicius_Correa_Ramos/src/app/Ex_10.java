package app;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) throws Exception {
//Instacia de um objeto tipo Scanner para armazenar dados das variaveis
        Scanner scanner=new Scanner(System.in);
        //Declaração das variáveis
        double totalVendas=0,media;
        //Array do tipo double com 5 posicoes
        double[] vendas = new double[5];
//Estrutura de repetição do tipo for , repete ate o tamanho do vetor vendas
        for(int i=0;i<vendas.length;i++){

            System.out.printf("Informe a venda %d \n",i+1);
            //Armazena as notas na posição para cada evento do loop
            vendas[i]=scanner.nextDouble();
            //concatena os valores de cada venda na variavel totalVendas
            totalVendas+=vendas[i];
            System.out.printf("Comissão %.2f \n",vendas[i]*0.1);
            
        }
//Calculo da media
        media=totalVendas/vendas.length;
        //Imprime na tela o somatorio das vendas
        System.out.printf("Total de vendas %.2f \n",totalVendas);
        //Imprime na tela a media
        System.out.printf("Media %.2f",media);
        //fecha a instancia do objeto Scanner
        scanner.close();
    }
}