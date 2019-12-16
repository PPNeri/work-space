package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_05 {
    public static void main(final String[] args) throws Exception {
        
        Scanner scanner=new Scanner(System.in);
        
        ArrayList<Integer> array=new ArrayList<>();
        
        boolean resp=true;
        
        int elemento,x=1;
        
        
        
        while(resp){
            
            System.out.println("Digite um numero ou 0 para sair");
            
            elemento=scanner.nextInt();
            
            if (elemento==0){
                
                resp=false;
                
            }else{
                
                array.add(elemento);
                
            }
        }
        
        
        NumRepetidos(array,x);
        
        
        scanner.close();
    }
    
    
    
    public static void NumRepetidos(ArrayList<Integer> a,int x) {
        Scanner scanner=new Scanner(System.in);
        int totalDeX = 0;

        System.out.println("Digite o numero que deseja checar suas repetições");
        x=scanner.nextInt();
        
        
        for (int elementos : a) {
            
            if(elementos==x){

                totalDeX++;    
            }
        }
        
        System.out.println("Numeros digitados "+a);
        System.out.printf("Quantidade total de numeros %d é  %d",x,totalDeX);
        
        scanner.close();
    }
    
        }