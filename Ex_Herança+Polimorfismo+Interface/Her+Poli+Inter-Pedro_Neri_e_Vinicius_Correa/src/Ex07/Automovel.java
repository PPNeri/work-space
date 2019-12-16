package Ex07;

public class Automovel extends Veiculo{
	
	protected int Hp;
	protected int numPortas;
	protected String tipo;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public void listarVerificacoes() {
		System.out.println("Automovel [cavalos=" + Hp + ", numPortas=" + numPortas + ", tipo=" + tipo + ", qtdRodas="
				+ qtdRodas + ", cor=" + cor + ", ano=" + ano + ", aro=" + aro + "]");
	}
	
	public void limpar() {
		System.out.println("Limpando");
	}
	
	public void ajustar() {
		System.out.println("Ajustando");
	}
	
	public void mudarOleo() {
		System.out.println("Troca oleo");
	}

	public int getHp() {
		return Hp;
	}

	public void setHp(int hp) {
		Hp = hp;
	}
	
	
	

}
