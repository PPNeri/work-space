package Ex09;

public class ImovelVelho extends Imovel{

	protected double descontoValor;

	public double getDescontoValor() {
		return descontoValor;
	}

	public void setDescontoValor(double descontoValor) {
		this.descontoValor = descontoValor;
	}
	
	
	
	@Override
	public String toString() {
		return "ImovelVelho [Endereco=" + Endereco + ", preco=" + preco + ", descontoValor=" + descontoValor + "]";
	}

	public void valorImovelVelho(double valor) {
		valor -= descontoValor;
		
		System.out.println("Esse imovel  tem o desconto de 3%. O preco  R$"+valor);
		
		
	}
}
