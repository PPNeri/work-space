package app;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o termo ");
        long i =scanner.nextLong();
       
        long resultado =Fibonacci(i);
        System.out.printf("O %dº termo da sequencia é : %d",i,resultado);
        scanner.close();
        
    }
   
    public static long Fibonacci(long i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        } else {
            long b = Fibonacci(i - 1) + Fibonacci(i - 2);
            
			return b;
		}		
	}
}




