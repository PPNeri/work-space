package app;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        String cargo;
        Double sal,emp=0.0;
        System.out.printf("Digite o cargo D-Diretoria,G-Gerência e O-Operacional\n");
        cargo=scanner.next();
        System.out.printf("Digite o salário\n");
        sal=scanner.nextDouble();
        
        switch(cargo){
            case "D":
            emp= sal*0.3;
                break;
                case "G":
                emp= sal*0.25;
                break;
                
        case "O":
        emp= sal*0.3;
        break;        
    }
    
    
    System.out.printf("Emprestimo aprovado de até %.2f",emp);

    scanner.close();
    }
}
