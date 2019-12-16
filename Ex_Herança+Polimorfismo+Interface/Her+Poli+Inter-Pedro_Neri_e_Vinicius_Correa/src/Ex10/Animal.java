package Ex10;

/**
 * Animal
 */
public class Animal {

    private String especie;


    public void emitirSom(){
         
    }

    public String andar(){
        return "Andando";
    }

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal [especie=" + especie + "]";
    }
    

}