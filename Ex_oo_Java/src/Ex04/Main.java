package Ex04;

import java.util.Scanner;

public class Main{
    ;       
    public static void main(String[] args) throws Exception {
        
        Scanner input=new Scanner(System.in);

//Instancia dos objetos

        Proprietario proprietario1 = new Proprietario("12-1-2019", "PEdro", "123456789","654987654");
        Carro carro1=new Carro("fiat", "preto", "1986", "123546789", 2, 5, 0, 200, 0, "sim", "nao", 30);
        Endereco end1=new Endereco("rua Getulio", "Centro", "Petropolis", "RJ", "25651020", "Sem complemento");
        Marca marca1=new Marca("Uno", 50000, "1986",1);
        
        
        System.out.println("cidade endereco 1 "+end1.getCidade());
        

        System.out.println("ano Marca 1 "+marca1.getAnoLançamento());
        
        
        System.out.printf("Proprietario %s nasceu em %s  \n", proprietario1.getNome(),proprietario1.getDataNascimento());
        
        System.out.printf(" Velocidade do carro %d Km/h\n",carro1.Acelera());
        System.out.printf(" Marcha %d \n",carro1.trocaMarcha());

        System.out.printf(" Velocidade do carro %d Km/h\n",carro1.Acelera());
        System.out.printf(" Marcha %d \n",carro1.trocaMarcha());
        
        System.out.printf(" Velocidade do carro %d Km/h\n",carro1.Acelera());
        System.out.printf(" Marcha %d \n",carro1.trocaMarcha());
        
        System.out.printf(" Velocidade do carro de pois de frear  %d Km/h\n",carro1.Freia());

        System.out.println(carro1.getVolTanque());

        System.out.println("Qual Consumo medio?");
        int consumoMedio=input.nextInt();
        System.out.printf("Autonomia %d Km",carro1.autonomia(consumoMedio));

        
        
        
    }
    }

    
