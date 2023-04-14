package LacosDeDecisao;

import java.util.Locale;
import java.util.Scanner;

public class SwitchAtividade1 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto (1 a 6): ");
		int codigo =sc.nextInt();
		
		System.out.println("Digite a quantidade comprada: ");
		int quantidade = sc.nextInt();
		
		double preco = 0;
		String produto = "";
		
		switch (codigo){
		case 1:
			preco = 10.00;
			produto = "Cachorro-quente";
			break;
        case 2:
            preco = 15.00;
            produto = "X-Salada";
            break;
        case 3:
            preco = 18.00;
            produto = "X-Bacon";
            break;
        case 4:
            preco = 12.00;
            produto = "Bauru";
            break;
        case 5:
            preco = 8.00;
            produto = "Refrigerante";
            break;
        case 6:
            preco = 13.00;
            produto = "Suco de laranja";
            break;
            
         default:
        	 System.out.println("Código não cadastrado");
		}
		
		
            double valorTotal = preco * quantidade;
            

		
            System.out.println("Produto: " + produto);
            System.out.println("Valor total: R$ " + valorTotal);
		sc.close();
		
	}
	
}
