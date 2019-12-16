package Ex05;

import java.util.Scanner;

public class Main {
    
       
    public static void main(String[] args) throws Exception {

        Scanner sca = new Scanner(System.in);

		System.out.println("Digita o número: ");
		String number = sca.nextLine();
		
		System.out.println("Digita a descrição do produto: ");
		String desc = sca.nextLine();
		
		System.out.println("Quantidade do produto do pedido:");
		int quant = sca.nextInt();
		
		System.out.println("Valor por um item");
		double valor = sca.nextDouble();
		
		Invoice inv = new Invoice( quant, valor);
		
		inv.setNum(number);
		inv.setDesc(desc);
		
		System.out.println("Número: "+inv.getNum()+
							"\nDescrição: "+inv.getDescricao()+
							"\nQuantidade: "+inv.getQuant()+
							"\nValor: "+inv.getPreco());
		System.out.println();
		
		System.out.println("O Valor total é "+inv.GetInvoiceAmount());
        

        
        
    }
    }

    
