package Ex05;

class Quadrado implements FormaGeometrica {

   private  int lado;

   

  public  double calculaArea(){

    return Math.pow(lado,2);


  }
 public double calculaPerimetro(){

return 4*lado;

 }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public String nome() {
        // TODO Auto-generated method stub
        return "Quadrado";
    }

    @Override
    public String toString() {
        return "Quadrado [lado=" + lado + "]";
    }

  
}