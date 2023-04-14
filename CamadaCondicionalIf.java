package LacosDeDecisao;

import java.util.Scanner;

public class CamadaCondicionalIf {
	
	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		numero= sc.nextInt();
		
		if(numero>0 && numero%2==0){
			System.out.println("O Número"+ " " + numero + " " + "é par e positivo!");
		}
		else if (numero<0 && numero%2==0){
			System.out.println("O Número"+ numero +  "é par e negativo");
		}
		else if (numero>0 && numero%2!=0 ) {
			System.out.println("O Número"+ " " + numero + " " + "é ímpar e positivo!");
		}
		
		else {
			System.out.println("O Número" + " " + numero +  " " + "é ímpar e negativo!");
		}
		
		sc.close();	
	}

}
