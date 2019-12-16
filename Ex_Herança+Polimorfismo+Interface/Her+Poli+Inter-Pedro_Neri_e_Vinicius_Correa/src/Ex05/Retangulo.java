package Ex05;

class Retangulo implements FormaGeometrica {

   private  int base,altura;

   

  public  double calculaArea(){

    return base*altura;


  }
 public double calculaPerimetro(){

return 2*(base+altura);

 }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String nome() {
        // TODO Auto-generated method stub
        return "Retangulo";
    }

    @Override
    public String toString() {
        return "Retangulo [altura=" + altura + ", base=" + base + "]";
    }
}