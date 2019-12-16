package Ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainClass {
        
    public static void main(String[] args) throws Exception {
        
        int resp=1;
        double total=0;
        Scanner scanner=new Scanner(System.in);

        Map<String, Integer> pedidosList = new HashMap<>();
        
        Pedido pedido=new Pedido();
        
        //Lista de Produtos cadastrados
        Produto produtos=new Produto();
        
        //Instacia dos Pordutos
       Produto arroz =new Produto();
       Produto feijao =new Produto();
       Produto macarrao=new Produto();
       Produto milho=new Produto();
       
       arroz.setPreco(2.5);       
       arroz.setQuantidadeEstoque(20);
       feijao.setPreco(3.5);
       feijao.setQuantidadeEstoque(50);       
       macarrao.setPreco(1.5);       
       macarrao.setQuantidadeEstoque(30);
       milho.setPreco(1.00);       
       milho.setQuantidadeEstoque(30);
       
       
       JOptionPane.showMessageDialog(null,"Faça seu Pedido");

       while(resp!=0){

       System.out.print("Lista de Produtos cadastrados ");
       produtos.listProdItem();    

       System.out.printf("Digite o item do produto\n");
       int item=scanner.nextInt();

       System.out.printf("Digite a Quantidade\n");
       int qtd=scanner.nextInt();

       

       String descricao=produtos.retornaDescricaoProduto(item);
       produtos.listProdVal();
       double val=produtos.retornaValor(descricao);
       total=total+(val*qtd);
       
       

       pedidosList.put(descricao, qtd);
        
       
       System.out.printf("Deseja Continuar?1-Sim,0-Não\n");
       resp=scanner.nextInt();
       
    }
    System.out.println("Pedido  "+pedidosList);
    System.out.println("Total do Pedido"+total);
    

    }

 

    

}
