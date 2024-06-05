package lpa6;

import java.util.Scanner;

public class Ex3Senha {

	public static void main(String[] args) {
		//Instanciar a classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Variáveis
		int senhaM, senhaT;
		double n1, n2, soma;
		
		//Entrada de dados
		System.out.print("Cadastre uma senha (Apenas Números): ");
		senhaM = ler.nextInt();
		
		System.out.println("Digite um valor: "); 
		n1 = ler.nextDouble();
		System.out.println("Digite outro valor: ");
		n2 = ler.nextDouble();
		
		//Processamento
		soma = n1 + n2;
		
		System.out.print("Digite a sua senha para desbloquear a soma: "); 
		senhaT = ler.nextInt();
		
		if (senhaT == senhaM) {
			System.out.println("A soma é: " + soma);
			System.exit(0);
		}
		//Saída
		System.out.println("Erro! Senha errada!");
		ler.close();
	}

}
