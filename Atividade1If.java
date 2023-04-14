package LacosDeDecisao;

import java.util.Scanner;

public class Atividade1If {

	public static void main(String[] args) {
		
		int a, b,c, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número A:");
		a = sc.nextInt();
		
		System.out.println("Digite o número B:");
		b = sc.nextInt();
		
		System.out.println("Digite o número C:");
		c = sc.nextInt();
		
		soma = (a+b);
		
		if(soma > c) {
			System.out.println("A Soma de A + B é Maior do que C.");
		}
		
		else if(soma < c){
			System.out.println("A Soma de A + B é Menor do que C.");
		}
		
		else{
			System.out.println("A Soma de A + B é Igual a C.");
		}
		
		
		sc.close();
	}
}
