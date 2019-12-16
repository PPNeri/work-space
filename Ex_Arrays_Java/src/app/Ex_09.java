package app;


import java.util.Random;

public class Ex_09 {
    public static void main(final String[] args) throws Exception {
    
        

        
        TrovaValor(GeraVetor(20));
        
        
        
    }
    
    
    
    public static void TrovaValor( int array[]) {
        
        for (int i = 0; i < array.length; i++) {
            if ((array[i] %2) ==0) {
                array [i]=1;
            
            }else{
                array [i]=-1;
            }
        }
        imprimeVetor(array);
        
    }
    
    
    public static void imprimeVetor(int array[]){
        
        
        System.out.print("Array modif.: ");
        for (int elements:array){
            System.out.print("   "+elements);
        }
        System.out.println();
        
    }
    
    public static int[] GeraVetor(int tamanho){
        int array[]=new int[tamanho];
        Random aleatorio=new Random();
        
        System.out.print("Array gerado :");
        for (int i=0;i<array.length;i++){
            array[i]=aleatorio.nextInt(199);
            System.out.print("  "+array[i]);
        }
        System.out.println();

        return array;
        
    }
    
    
   
        
    }
