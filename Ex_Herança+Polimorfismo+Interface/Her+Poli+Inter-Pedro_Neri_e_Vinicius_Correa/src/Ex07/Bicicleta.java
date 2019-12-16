package Ex07;

public class Bicicleta extends Veiculo{
	
	int numMarchas;
	String tipo;
	
	public int getNumMarchas() {
		return numMarchas;
	}
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public void listarVerificacoes() {
		System.out.println( "Bicicleta [numMarchas=" + numMarchas + ", tipo=" + tipo + ", qtdRodas=" + qtdRodas + ", cor=" + cor
				+ ", ano=" + ano + ", aro=" + aro + "]");
	}
	
	public void limpar() {
		System.out.println("Limpando a biKe");
	}
	
	public void ajustar() {
		System.out.println("Ajustando ");
	}
	
	public void mudarOleo() {
		System.out.println("troca oleo ");
	}
	

}
