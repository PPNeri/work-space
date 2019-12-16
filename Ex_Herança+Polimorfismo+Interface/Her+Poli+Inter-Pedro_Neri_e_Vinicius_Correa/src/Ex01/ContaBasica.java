package Ex01;

import javax.swing.JOptionPane;

/**
 * Conta
 */
public class ContaBasica {

     private double saldo;
    private long numeroConta;
    private String cpfTitular;
    private String nomeTitular;

    public double getSaldo() {
        
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


public double  deposita(double val){

saldo=saldo+val;
return saldo;

}

public double saque(double val){

    

    if((getSaldo()+val*0.005) < val){

        JOptionPane.showMessageDialog(null, "Você não tem dinheiro seu Pobre", "No Saldo", JOptionPane.ERROR_MESSAGE);
        return saldo;

    }else{

        saldo=getSaldo()-(val*(0.005+1));
        return saldo;
    }
}

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public ContaBasica(double saldo, long numeroConta, String cpfTitular, String nomeTitular) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.cpfTitular = cpfTitular;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public String toString() {
        return "ContaBasica -> cpf do Titular :" + cpfTitular + ", Nome do Titular :" + nomeTitular + ", Numero da Conta=" + numeroConta
                + ", Saldo Atual :" + saldo;
    }







}
