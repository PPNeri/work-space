package Ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        int nformas;

        
        List<FormaGeometrica> lista = new ArrayList<FormaGeometrica>();
        
        System.out.println("Quantas formas deseja Criar");
        nformas=input.nextInt();

        int figuras[] = new int [nformas];

        for (int elementos:figuras){
            
            System.out.println("Qual forma deseja criar 1-Circulo,2-Quadrado ou 3-Retangulo");
            int formaDesejada=input.nextInt();

            switch(formaDesejada){

                case 1:
                System.out.println("Digite o raio");
                int raio=input.nextInt();
                FormaGeometrica circulo = new Circulo(raio);
                lista.add(circulo);
                break;
                case 2:
                System.out.println("Digite o lado");
                int lado=input.nextInt();
                FormaGeometrica quadrardo=new Quadrado(lado);
                lista.add(quadrardo);
                break;
                case 3:
                System.out.println("Digite a base ");
                int base=input.nextInt();
                System.out.println("Digite a altura ");
                int altura=input.nextInt();
                FormaGeometrica retangulo=new Retangulo(base, altura);
                lista.add(retangulo);
                break;

            }


        }
        
        
      
      
        for (FormaGeometrica fg : lista) {
            
        
        System.out.printf("Área do %s é %.2f \n", fg.nome(),fg.calculaArea());
           
        System.out.printf("Perímetro do %s é %.2f \n",fg.nome(),fg.calculaPerimetro());

        
            System.out.println(fg.toString());


        
     
    }
    input.close();
    }
}