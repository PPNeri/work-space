package app;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite numero 1");
        int a =scanner.nextInt();
        System.out.println("Digite numero 2");
        int b =scanner.nextInt();
        int resultado =multRec(a,b);
        System.out.println("Resultado da operação: "+resultado);
        scanner.close();
        
    }
   
    public static int multRec(int a, int b) {
        if(a == 0 || b == 0) {
            return 0;
        }
        
        return a + multRec(a, b - 1);
    }
    

    





}