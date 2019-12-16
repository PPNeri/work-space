package app;

import java.util.Random;

public class Ex_07 {
    public static void main(final String[] args) throws Exception {
    
               
        MaiorValor(GeraVetor(10));
        
        
        
    }
    
    
    
    public static void MaiorValor( int array[]) {
        int maior=0,posicaoDoMaior=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array [i];
                posicaoDoMaior = i--;
            }
        }
        imprimeVetor(array);
        System.out.printf("O maior valor encontrado foi %d na posição %d",maior,posicaoDoMaior);
    }
    
    
    public static void imprimeVetor(int array[]){
        
        
        System.out.print("Array: ");
        for (int elements:array){
            System.out.print(" "+elements);
        }
        System.out.println();
        
    }
    
    public static int[] GeraVetor(int tamanho){
        int array[]=new int[tamanho];
        Random aleatorio=new Random();
        
        for (int i=0;i<array.length;i++){
            array[i]=aleatorio.nextInt(199)-99;
        }

        return array;
        
    }
    
    
   
        
    }
