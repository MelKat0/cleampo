package lpa6;

import java.util.Scanner;

public class Ex5MultiMatriz {

	public static void main(String[] args) {
		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Variáveis
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];
		
		//Entrada de dados
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				a[i][j] = (int)Math.round(Math.random()*10);
				b[i][j] = (int)Math.round(Math.random()*10);
		//Processamento
				c[i][j] = a[i][j]*b[i][j];
			}
		}
		//Saída
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.println(" Os valores da MATRIZ C são na posição " + "[" + i + "," + j + "]" + " é :" + c[i][j]);
			}
		}
		ler.close();
	}

}
