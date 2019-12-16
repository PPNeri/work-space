package app;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a");
        int i =scanner.nextInt();
       
        int resultado =Fat(i);
        System.out.printf("O resultado é: %d",resultado);
        scanner.close();
        
    }
   
    public static int Fat(int n) {
        if(n < 2) {
            return 1;
        }
        return n * Fat(n - 1);
    }
}




