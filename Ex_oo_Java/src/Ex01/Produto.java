package Ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Pdorduto
 */
public class Produto {
    Map<Integer,String> ProdItem = new HashMap<>();
    Map<String,Double> ProdVal = new HashMap<>();

    
   

    
    private double preco;
    private int quantidadeEstoque;
 
     
    public void listProdItem(){
        ProdItem.put(1,"Arroz");
        ProdItem.put(2,"Feijão");
        ProdItem.put(3,"Leite");
        ProdItem.put(4,"Refrigerante");
        System.out.println((ProdItem));
    }
    public void listProdVal(){
        ProdVal.put("Arroz",2.5);
        ProdVal.put("Feijão",3.20);
        ProdVal.put("Leite",3.00);
        ProdVal.put("Refrigerante",4.00);
        System.out.println((ProdVal));
    }

    public String retornaDescricaoProduto(int item){
        String desc=ProdItem.get(item);
        return desc;
    }
    public Double retornaValor(String descricao){
        Double val=ProdVal.get(descricao);
        return val;
    }
   
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
  



public int verificaQuantidade(Object obj,int quantidade)
{ 


    int quantidadeEstoque= ((Produto) obj).getQuantidadeEstoque()-quantidade;
    if (quantidadeEstoque<0){
        
        System.out.printf("Sem estoque desse produto so temos %d unidades \n",getQuantidadeEstoque());
        quantidadeEstoque=getQuantidadeEstoque();
    }
 return quantidadeEstoque;
}


  

    



    




}

