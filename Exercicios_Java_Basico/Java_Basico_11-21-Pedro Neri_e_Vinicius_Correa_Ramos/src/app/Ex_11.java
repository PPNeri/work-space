package app;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
   
        Double salarioLiq,salarioB,desc,valorEmprestimo,maxEmp;
        int emp;
        //imprime na tela do usuario
        System.out.println("Informe o salario Bruto ");
        salarioB = scanner.nextDouble();
        System.out.println("Informe os descontos ");
        desc= scanner.nextDouble();
        salarioLiq=salarioB-desc;
        maxEmp=salarioLiq*0.3;
        System.out.println("Deseja emprestimo ?1-sim e 0-não");
        emp= scanner.nextInt();
        while(emp==1){
        System.out.println("Digite o valor do emprestimo: ");
        valorEmprestimo= scanner.nextDouble();
            if(valorEmprestimo>salarioLiq*0.3){
                System.out.printf("Não é possivel realizar este emprestimo, vamor máximo é de :%.2f \n",maxEmp);
                System.out.println("Deseja emprestimo ?1-sim e 0-não");
                emp= scanner.nextInt();
        }else{
                System.out.println("Emprestimo realizado com sucesso");
                emp=2;
            }
        }
        
        System.out.println("Obrigado e volte sempre");
          
        scanner.close();
    }
}