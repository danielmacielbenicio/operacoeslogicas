package operacoes;

import java.util.Scanner;

public class OperadorLogicoOu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Entrada
		
		int salario = 900; //declarar a variável salário
		int idade = 19; //declarar a variável idade
		boolean resultado; //declarar a variável resultado
		
		//Processamento
		
		boolean emp_aprovado = (salario >1000) || (idade > 18);
		
		resultado = (salario > 1000 || idade > 10)?true:false;  
		
		//Saída
		System.out.println(emp_aprovado);
		System.out.println(resultado);
		sc.close();
	}

}
