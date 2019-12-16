package app;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite numero Inteito");
        int i =scanner.nextInt();
        int resultado =IntToBi(i);
        System.out.println("Conversão para Binario: "+resultado);
        scanner.close();
        
    }
   
    public static int IntToBi(int n){
        if (n < 2) 
            return n;
        return ( 10 * IntToBi( n / 2 ) ) + n % 2;
    }
    
}





