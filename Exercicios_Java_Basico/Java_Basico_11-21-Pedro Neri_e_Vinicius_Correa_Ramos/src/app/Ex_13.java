package app;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int dia,idade;
        String mes,nome;
        
        for(int i=0;i<2;i++){

        System.out.println("Digite seu nome");
        nome=scanner.next();
        System.out.println("digite sua idade");
        idade=scanner.nextInt();
        System.out.println("digite o dia da data de aniversario");
        dia=scanner.nextInt();
        System.out.println("digite o mes da data de aniversario");
        mes=scanner.next();

        if (((mes.equals("4") || mes.equals("6") || mes.equals("9") || mes.equals("11")) && dia > 30) || (mes.equals("2") && dia >=29)){
            System.out.printf("%s sua data está inválida, insira uma data válida",nome); 
        }else{

        switch(mes){
            case "1":
                mes="Janeiro";
                break;
            case "2":
                mes="Fevereiro";
                break;
            case "3":
                mes="Março";
                break;
            case "4":
                mes="Abril";
                break;
            case "5":
                mes="Maio";
                break;
            case "6":
                mes="Junho";
                break;
            case "7":
                mes="Julho";
                break;
            case"8":
                mes="Agosto";
                break;
            case "9":
                mes="Setembro";
                break;
            case "10":
                mes="Outubro";
                break;
            case "11":
                mes="Novembro";
                break;
            case "12":
                mes="Dezembro";
                break;
                
        }

        System.out.printf("Data válida!! %s o dia de seu aniversário é %d de %s\n",nome,dia,mes);
    }
}
scanner.close();
    }
}