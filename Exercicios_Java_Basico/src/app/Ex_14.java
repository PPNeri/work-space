package app;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int dia,idade;
        String mes,signo="",nome;
        
        for(int i=0;i<2;i++){

        System.out.println("Digite seu nome");
        nome=scanner.next();
        System.out.println("digite sua idade");
        idade=scanner.nextInt();
        System.out.println("digite o dia da data de aniversario");
        dia=scanner.nextInt();
        System.out.println("digite o mes da data de aniversario");
        mes=scanner.next();

        if ((mes.equals("4")||mes.equals("6")||mes.equals("9")||mes.equals("11")) && dia > 30 || (mes.equals("2") && dia >=29)){
            System.out.printf("data inválida, insira uma data válida");
            
        }else{

            if (mes.equals("1") &&  dia>20 || mes.equals("2") && dia<19)
                signo="aquarios";
            else
                
            if (mes.equals("2") && dia>18 || mes.equals("3") && dia<20)
                signo="peixes";
            else
            if (mes.equals("3") && dia>19 || mes.equals("4") && dia<21)
                signo="áries";
            else
            if (mes.equals("4") && dia>20 || mes.equals("5") && dia<21)
                signo = "Touro";
            else
            if (mes.equals("5") && dia>20 || mes.equals("6") && dia<21)
                signo = "gêmios";
            else
            if (mes.equals("6") && dia>20 || mes.equals("7") && dia<22)
                signo = "cancêr";
            else
            if (mes.equals("7") && dia>21 || mes.equals("8") && dia<23)
                signo = "leão";
            else
            if (mes.equals("8") && dia>22 || mes.equals("9") && dia<23)
                signo = "virgem";
            else
            if (mes.equals("9") && dia>22 || mes.equals("10") && dia<23)
                signo = "libra";
            else
            if (mes.equals("10") && dia>22 || mes.equals("11") && dia<22)
                signo = "escorpião";
            else
            if (mes.equals("11") && dia>21 || mes.equals("12") && dia<22)
                signo = "sagitario";
            else
            if (mes.equals("12") && dia>21 || mes.equals("1") && dia<22)
                signo = "capricornio";
        

            switch(mes){
                case "1":
                    mes="Janeiro";
                    break;
                case "2":
                    mes="Fevereiro";
                    break;
                case "3":
                    mes="março";
                    break;
                case "4":
                    mes="Abril";
                    break;
                case "5":
                    mes="maio";
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
                    mes="dezembro";
                    break;
                    
            }

            
            System.out.printf("%s sua data é válida o dia de seu aniversário é %d de %s e seu signo é %s\n",nome,dia,mes,signo);
        }
            
    }
            
            
            
            
    scanner.close();
            
        }
}