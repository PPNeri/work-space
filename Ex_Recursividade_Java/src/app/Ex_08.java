package app;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite primeiro numero");
        int i =scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int j =scanner.nextInt();
        System.out.println("Digite o incremento da sequencia");
        int k =scanner.nextInt();
        int resultado =SomaSerie(i,j,k);
        System.out.println("Resultado da operação: "+resultado);
        scanner.close();
        
    }
   
    public static int SomaSerie(int i, int j, int k){
        int soma = 0; //variável que guardará o valor da soma
        if(i<j){ // enquanto o valor que i está assumindo for menor que j
            return soma = i + SomaSerie(i+k,j,k);
            
        }
        else{ //quando chegarmos aqui, só faltará o j a ser adicionado ao nosso valor calculado
            return soma = soma + j; //retornamos então o valor da soma de todos os termos antes de j + j
        }
        
        //return soma;
    }
    
}





