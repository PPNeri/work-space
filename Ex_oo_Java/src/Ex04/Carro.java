package Ex04;


public class Carro {
 

    private String modelo; 
    private String cor;
    private String ano;
    private String chassi;
    private int nrPortas;
    private int nrMarchas=5;
    private int marchaAtual=0;
    private int velMax=200;
    private int velAtual=0;
    private String tetoSolar;
    private String cambioAutomatico;
    private int volTanque;

  
    public int Acelera(){
        
    if (velAtual>=velMax){
        System.out.println("Você já alcançou a veloxidade máxima");
    }else{
        velAtual=velAtual+1;
    }
    return velAtual;
    }
    
    public int Freia(){
        velAtual=0;
        return velAtual;
    }

    public int trocaMarcha(){
        if (marchaAtual>=nrMarchas){
        System.out.println("Você já alcançou a marcha máxima");
    }else{
        marchaAtual=marchaAtual+1;
    }
    return marchaAtual;
    }
    public int reduzMarcha(){
        if (marchaAtual==0){
        System.out.println("Você já alcançou a marcha minima");
    }else{
        marchaAtual=marchaAtual-1;
    }
    return marchaAtual;
    }

    public int autonomia(int consumoMedio){
        int distancia=consumoMedio*volTanque;
        return distancia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getNrPortas() {
        return nrPortas;
    }

    public void setNrPortas(int nrPortas) {
        this.nrPortas = nrPortas;
    }

    public int getNrMarchas() {
        return nrMarchas;
    }

    public void setNrMarchas(int nrMarchas) {
        this.nrMarchas = nrMarchas;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public int getVelAtual() {
        return velAtual;
    }

    public void setVelAtual(int velAtual) {
        this.velAtual = velAtual;
    }

    public String getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(String tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public String getCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(String cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public int getVolTanque() {
        return volTanque;
    }

    public void setVolTanque(int volTanque) {
        this.volTanque = volTanque;
    }

    public Carro(String modelo, String cor, String ano, String chassi, int nrPortas, int nrMarchas, int marchaAtual,
            int velMax, int velAtual, String tetoSolar, String cambioAutomatico, int volTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.chassi = chassi;
        this.nrPortas = nrPortas;
        this.nrMarchas = nrMarchas;
        this.marchaAtual = marchaAtual;
        this.velMax = velMax;
        this.velAtual = velAtual;
        this.tetoSolar = tetoSolar;
        this.cambioAutomatico = cambioAutomatico;
        this.volTanque = volTanque;
    }

    




}
