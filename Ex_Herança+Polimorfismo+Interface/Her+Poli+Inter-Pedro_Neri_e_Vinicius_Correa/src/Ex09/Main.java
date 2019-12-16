package Ex09;

public class Main {
	public static void main(String[] args) {
		
		
		ImovelNovo newImovel = new ImovelNovo();
		ImovelVelho oldImovel = new ImovelVelho();
		
		oldImovel.setEndereco("Rua Campos, 5500");
		oldImovel.setPreco(100500);
		oldImovel.setDescontoValor(oldImovel.getPreco()*0.03);
		System.out.println("\n\n"+oldImovel.toString());
		oldImovel.valorImovelVelho(oldImovel.getPreco());
		
		newImovel.setEndereco("Getulio vargas, 355");
		newImovel.setPreco(550300);
		newImovel.setValorAdicional(newImovel.getPreco()*0.03);
		System.out.println(newImovel.toString());
		newImovel.valorImovelNovo(newImovel.getPreco());
		
	}
}
