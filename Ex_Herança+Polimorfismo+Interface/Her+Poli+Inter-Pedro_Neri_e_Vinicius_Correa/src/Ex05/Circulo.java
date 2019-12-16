package Ex05;

class Circulo implements FormaGeometrica {

   private  int raio;
   private final double PI=Math.PI;

   

  public  double calculaArea(){

    return PI*Math.pow(raio,2);


  }
 public double calculaPerimetro(){

return 2*PI*raio;

 }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double getPI() {
        return PI;
    }

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public String nome() {
        
        return "Circulo";
    }

    @Override
    public String toString() {
        return "Circulo [PI=" + PI + ", raio=" + raio + "]";
    }

   
  
}