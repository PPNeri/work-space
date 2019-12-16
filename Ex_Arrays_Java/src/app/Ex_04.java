package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_04 {
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
            
        
        NumNegativos(array);
        
     
        scanner.close();
    }
    


    public static void NumNegativos(ArrayList<Integer> array) {
        int totalNegativo = 0;
        
        for (int elementos : array) {

            if(elementos<0){

                totalNegativo++;    
            }
        }
        
        System.out.println("Numeros digitados "+array);
        System.out.println("Quantidade total de numeros Negativos = "+totalNegativo);
        
        
    }
    
        }