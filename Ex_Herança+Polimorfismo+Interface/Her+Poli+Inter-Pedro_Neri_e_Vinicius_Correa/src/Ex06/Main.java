package Ex06;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Gerente g = new Gerente();
		Assistente a = new Assistente();
		AssistAdm aa= new AssistAdm();
		AssistenteTecnico at = new AssistenteTecnico();
		
		g.setCargo("gerente");
		g.setMatricula(123456);
		g.setNome("Joao");
		g.setSalario(800.00);
		
		a.setMatricula(32100);
		a.setNome("Vini");
		a.setSalario(2890.00);
		
		
		aa.setMatricula(234);
		aa.setNome("Jose");
		aa.setSalario(2500.00);
		aa.setAdicionalNoturno(aa.getSalario()*0.3);
		aa.setTurno("Diurno");
		
		at.setMatricula(4322);
		at.setNome("Lucas");
		at.setSalario(1500.00);
		at.setBonusSalarial(at.getSalario()*0.25);
		
		funcionarios.add(at);
		funcionarios.add(a);
		funcionarios.add(aa);
		funcionarios.add(g);
		
		
		for (Funcionario funcionario : funcionarios) {
			
			System.out.println(funcionario.toString()+"\n");
			
		}
		

	}

}
