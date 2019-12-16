package app;

import java.util.Random;

public class Ex_02 {
    public static void main(String[] args) throws Exception {
        //instância da classe “Random” são objetos geradores de números aleatório
        Random aleatorio=new Random();
        final int N=20;
        int range=20;

        double a[]=new double[N];

        
//Laço de repetição para gerar numeros aleatorio do tipo double
        for(int i=0;i<a.length;i++){
            //gera valores aleatorios de 1 a 20 e alimenta o vetor
            a[i]=(range*(aleatorio.nextDouble())+1);
            //imprime o vetor 
            System.out.printf(" %.1f ",a[i]);

        }

        
        }

}
