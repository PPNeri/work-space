package Ex01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
     int resp=1;
     Scanner input=new Scanner (System.in);

        ContaBasica cb1= new ContaBasica(20.00, 123456, "123456789", "Pedro Paulo de Correa Ramos");
        ContaEspecial ce1=new ContaEspecial(25.00, 321654, "12545688", "Vinicius Neri");

        while(resp!=0){

        System.out.println("Digite tipo de conta 1-Especial 2-Basica 0-Sair");
        resp=input.nextInt();

        if(resp==1){

            JOptionPane.showMessageDialog(null, "Você esta na Conta especial clique ok para continuar ");
            System.out.println("Digite a operação desejada 1-saque 2-Deposito 3-Ver saldo 0-Sair");
            int op=input.nextInt();
            switch(op){
                
                case 1:
                System.out.println("Digite o valor para saque");
                double val=input.nextDouble();
                ce1.saque(val);
                System.out.printf("Saldo atual de %.2f \n",ce1.getSaldo());
                break;
                case 2:
                System.out.println("Digite o valor para deposito");
                double dep=input.nextDouble();
                ce1.deposita(dep);
                System.out.printf("Saldo atual de %.2f \n",ce1.getSaldo());
                break;
                case 3:
                System.out.println(ce1.getSaldo());
                break;
                default:
                System.out.printf("%s Tenha um bom dia",ce1.getNomeTitular());
                resp=0;
                break;
                
                
                
            }
            
            
            
            
        }else if(resp==2){
            JOptionPane.showMessageDialog(null, "Você esta na Conta Basica que triste !! clique ok para continuar ");
            System.out.println("Digite a operação desejada 1-saque 2-Deposito 3-Ver saldo 0-Sair");
            int op=input.nextInt();
            switch(op){
                
                case 1:
                System.out.println("Digite o valor para saque");
                double val=input.nextDouble();
                cb1.saque(val);
                System.out.printf("Saldo atual de %.2f \n",cb1.getSaldo());
                break;
                case 2:
                System.out.println("Digite o valor para deposito");
                double dep=input.nextDouble();
                cb1.deposita(dep);
                System.out.printf("Saldo atual de %.2f \n ",cb1.getSaldo());
                break;
                case 3:
                System.out.println(cb1.getSaldo());
                break;
                default:
                System.out.printf("%s Tenha um bom dia",cb1.getNomeTitular());
                resp=0;
                break;
                
            }
            

    }
        System.out.println("nosso banco agradece");
        

    }
    input.close();
    }
}