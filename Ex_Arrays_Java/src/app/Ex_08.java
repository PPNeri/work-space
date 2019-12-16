package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_08 {
    public static void main(final String[] args) throws Exception {
        
        Scanner scanner=new Scanner(System.in);

        ArrayList<Integer> array=new ArrayList<>();
        
        boolean resp=true;
        
        int elemento;
        

        
        while(resp){

                System.out.println("Digite um numero ou para sair digite 0");

                elemento=scanner.nextInt();
                
                if (elemento==0){
                
                    resp=false;
                    
                }else{
                
                    array.add(elemento);

                }
            }
            
        
        imprimeVetor(array);
        
     
        scanner.close();
    }
    


    public static void imprimeVetor(ArrayList<Integer> array) {

        System.out.print("Array: ");
        for (int elements : array) {
            System.out.print(" "+elements);
        }
        System.out.println();
        
    }
        
        
        
    }
    
        