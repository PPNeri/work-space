package Ex06;

public class AssistAdm extends Assistente {
	
	double adicionalNoturno;
	String turno;

	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	@Override
	public String toString() {
		return "AssistenteAdministrativo [adicionalNoturno=" + adicionalNoturno + ", turno=" + turno + ", matricula="
				+ matricula + ", nome=" + nome + ", salario=" + salario + "]";
	}

	

	
	
	
}
