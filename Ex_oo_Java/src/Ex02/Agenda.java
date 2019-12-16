package Ex02;

/**
 * Agenda
 */
public class Agenda {

    private String tarefa;
    private String dia;
    private String mes;
    private String ano;

    
	public String getTarefa() {
		return tarefa;
	}
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}

    public Agenda(String tarefa, String dia, String mes, String ano) {
        this.tarefa = tarefa;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

}