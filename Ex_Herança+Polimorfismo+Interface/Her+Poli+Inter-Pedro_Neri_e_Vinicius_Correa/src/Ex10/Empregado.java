package Ex10;

/**
 * Empregado
 */
public class  Empregado {

     protected String noma;
     protected int matricula;

    public Empregado(String noma, int matricula) {
        this.noma = noma;
        this.matricula = matricula;
    }

    public String getNoma() {
        return noma;
    }

    public void setNoma(String noma) {
        this.noma = noma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Empregado [matricula=" + matricula + ", noma=" + noma + "]";
    }
     
}