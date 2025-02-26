package operacoes;

import java.util.Scanner;

public class OperadorLogicoE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Entrada
		
		int salario = 900; //declarar a variável salário
		int idade = 19; //declarar a variável idade
		
		//Processamento
		
		boolean emp_aprovado = (salario >1000) && (idade > 18);
		
		//Saída
		
		System.out.println(emp_aprovado);
		sc.close();
	}

}
