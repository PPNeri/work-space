package Ex04;

/**
 * Marca
 */
public class Marca {

    private String nome;
    private int nrDeModelos;
    private String anoLançamento;
    private int códigoIdentificador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public String getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(String anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public int getCódigoIdentificador() {
        return códigoIdentificador;
    }

    public void setCódigoIdentificador(int códigoIdentificador) {
        this.códigoIdentificador = códigoIdentificador;
    }

    public Marca(String nome, int nrDeModelos, String anoLançamento, int códigoIdentificador) {
        this.nome = nome;
        this.nrDeModelos = nrDeModelos;
        this.anoLançamento = anoLançamento;
        this.códigoIdentificador = códigoIdentificador;
    }
}