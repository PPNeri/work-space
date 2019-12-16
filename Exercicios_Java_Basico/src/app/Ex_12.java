package app;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);

        
        System.out.println("Informe a idade");
        int idade=scanner.nextInt();

        if (idade < 16){
           System.out.println("Não vota");
           
        } else if (idade==16 || idade ==17|| idade > 70) {
            System.out.println("Voto facultativo");
            
        } else {
            System.out.println("Voto Obrigatório");
           
       }

       scanner.close();
}
}