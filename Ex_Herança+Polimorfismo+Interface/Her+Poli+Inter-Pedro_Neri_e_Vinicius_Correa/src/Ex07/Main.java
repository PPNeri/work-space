	package Ex07;

public class Main {

	public static void main(String[] args) {
		
		
		Automovel auto = new Automovel();
		Bicicleta bike =new Bicicleta();
		
		auto.setAno(2000);
		auto.setAro(15);
		auto.setHp(25);
		auto.setCor("Amarela");
		auto.setNumPortas(2);
		auto.setQtdRodas(4);
		auto.setTipo("Caminhao");
		
		auto.listarVerificacoes();
		System.out.println();
		
		auto.limpar();
		System.out.println();
		
		auto.ajustar();
		System.out.println();
		
		auto.mudarOleo();
		System.out.println();
		
		
		bike.setAno(1988);
		bike.setAro(10);
		bike.setCor("Rosa");
		bike.setNumMarchas(18);
		bike.setQtdRodas(2);
		bike.setTipo("MontainBike");
		
		bike.listarVerificacoes();
		System.out.println();
		
		bike.limpar();
		System.out.println();
		
		bike.ajustar();
		System.out.println();
		
		bike.mudarOleo();
		

	}

}
