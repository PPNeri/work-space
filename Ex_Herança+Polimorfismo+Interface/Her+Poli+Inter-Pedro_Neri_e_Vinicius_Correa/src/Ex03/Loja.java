package Ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main
 */
public class Loja {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        List<Produto> lista = new ArrayList<Produto>();
        
       int produtos[] = new int [5];

        for (int elementos:produtos){
            
            System.out.println("Qual produto deseja adicionar 1-Livro,2-CD ou 3-DVD");
            int prodAdd=input.nextInt();

            switch(prodAdd){

                case 1:
                
                System.out.println("Digite o nome");
                String nome=input.next();
                System.out.println("Digite o preco");
                double preco=input.nextDouble();
                System.out.println("Digite o autor");
                String autor=input.next();
                System.out.println("Digite o Codigo de Barras");
                Long codBarras=input.nextLong();
                Livro livro = new Livro(nome, preco, codBarras);
                livro.setAutor(autor);
                lista.add(livro);
                break;

                case 2:
                System.out.println("Digite o nome");
                nome=input.next();
                System.out.println("Digite o preco");
                preco=input.nextDouble();
                System.out.println("Digite o n faixas");
                int nFaixas=input.nextInt();
                System.out.println("Digite o Codigo de Barras");
                codBarras=input.nextLong();
                Cds cd=new Cds(nome, preco, codBarras);
                cd.setnFaixa(nFaixas);
                lista.add(cd);
                break;

                case 3:
                System.out.println("Digite o nome");
                nome=input.next();
                System.out.println("Digite o preco");
                preco=input.nextDouble();
                System.out.println("Digite a duração");
                String dur=input.next();
                System.out.println("Digite o Codigo de Barras");
                codBarras=input.nextLong();
                Dvds dvd=new Dvds(nome, preco, codBarras);
                dvd.setDuração(dur);
                lista.add(dvd);
                break;

            }


        }
        
             
      
        for (Produto prod : lista) {
            
    

            System.out.print(prod.toString());
            
            prod.equals(prod);
}
        
input.close();
    }


    }


    
