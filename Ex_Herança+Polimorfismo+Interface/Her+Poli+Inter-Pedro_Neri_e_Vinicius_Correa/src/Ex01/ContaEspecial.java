package Ex01;

import javax.swing.JOptionPane;

/**
 * Conta
 */
public class ContaEspecial extends ContaBasica {

    

    public ContaEspecial(double saldo, long numeroConta, String cpfTitular, String nomeTitular) {
        super(saldo, numeroConta, cpfTitular, nomeTitular);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double saque(double val) {
        
        if((getSaldo()+val*0.001) < val){

            JOptionPane.showMessageDialog(null, "Você não tem dinheiro seu Pobre", "No Saldo", JOptionPane.ERROR_MESSAGE);
            return super.getSaldo();
    
        }else{
    
            setSaldo(getSaldo() - (val * (0.001 + 1)));
            return super.getSaldo();
        }
        
    }

    

  






}
