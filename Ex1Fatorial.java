package lpa6;

import java.util.Scanner;

public class Ex1Fatorial {

	public static void main(String[] args) {
		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Variáveis
		int fat = 1, num;
		
		//Entrada de dados
		System.out.println("Informe o Fatorial: ");
		num = ler.nextInt(); 
		
		//Processamento
		if (num<0) { 
			System.out.println("Não existe fatorial de número negativo!");
			System.exit(0);
		}
		for (int i = 1; i<= num; i++) {
				fat *= i;
		}
		//Saída
		System.out.println("O Fatorial de " + num + ": é " + fat);
		ler.close();
	}
}
