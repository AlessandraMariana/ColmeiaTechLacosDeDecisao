package LacosDeDecisao;

import java.util.Locale;
import java.util.Scanner;

public class CamadaCondicionalSwitch {
	public static void main(String[] args) {
		  Locale.setDefault(Locale.US);
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o nome do colaborador: ");
	        String nome = sc.nextLine();

	       
	        System.out.print("Digite o código do cargo (1 a 6): ");
	        int codigo = sc.nextInt();

	        
	        System.out.print("Digite o valor do salário: ");
	        float salario = sc.nextFloat();

	        
	        float reajuste = 0;
	        String cargo = "";

	        switch (codigo) {
	            case 1:
	                cargo = "Gerente";
	                reajuste = 0.1f;
	                break;
	            case 2:
	                cargo = "Vendedor";
	                reajuste = 0.07f;
	                break;
	            case 3:
	                cargo = "Supervisor";
	                reajuste = 0.09f;
	                break;
	            case 4:
	                cargo = "Motorista";
	                reajuste = 0.06f;
	                break;
	            case 5:
	                cargo = "Estoquista";
	                reajuste = 0.05f;
	                break;
	            case 6:
	                cargo = "Técnico de TI";
	                reajuste = 0.08f;
	                break;
	            default:
	                System.out.println("Código de cargo não existe!");
	        }

	        float novoSalario = salario + (reajuste * salario);
	        System.out.println("Nome do colaborador: " + nome);
	        System.out.println("Cargo: " + cargo);
	        System.out.println("Salário atual: R$ " + novoSalario);
	        
	        sc.close();
		
	}

}
