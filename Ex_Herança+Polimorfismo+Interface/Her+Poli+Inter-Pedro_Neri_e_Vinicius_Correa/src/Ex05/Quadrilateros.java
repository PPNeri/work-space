package Ex05;

class Quadrilateros implements FormaGeometrica {

   private  int lado1,lado2,lado3,lado4;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado4() {
        return lado4;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }

    public Quadrilateros(int lado1, int lado2, int lado3, int lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
   

  public  double calculaArea(){

    return lado1*lado2;


  }
 public double calculaPerimetro(){

return lado1+lado2+lado3+lado4;

 }

    @Override
    public String nome() {
        
        return "Quadrado";
    }

    @Override
    public String toString() {
        return "Quadrilateros [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4=" + lado4 + "]";
    }
}