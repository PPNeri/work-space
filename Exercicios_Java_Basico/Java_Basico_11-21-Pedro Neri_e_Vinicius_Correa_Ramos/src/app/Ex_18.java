package app;

import java.util.Random;
import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        Random generator=new Random();
        int count=1;
        int ale=generator.nextInt(101);
        System.out.println(ale);
        System.out.println("Digite o numero sorteado");
        int num=scanner.nextInt();
    
        String dica;
        
        if (num!=ale){
            while(num!=ale){
                
                if (num>ale){
                    dica="Numero sorteado é menor";
                }else{
                    dica="Numero sorteado é maior";
                }
                System.out.printf("Você errou tente de novo.%s \n",dica);
                num=scanner.nextInt();
                
                
                count++;
            }

        }
        
        System.out.printf("Parabens você acertou em %d tentaivas",count);
        scanner.close();
        
}
}