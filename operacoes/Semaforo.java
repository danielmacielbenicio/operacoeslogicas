package operacoes;

import java.util.Scanner;

public class Semaforo {

	public static void main(String[] args) {
		// Tabela-verdade do operador AND
		System.out.println("Tabela-verdade do operador AND:");
		System.out.println("Sinal verde | Pedestres | Pode atravessar?");
		System.out.println("true        | true      | " + (true && !true));
		System.out.println("true        | false     | " + (true && !false));
		System.out.println("false       | true      | " + (false && !true));
		System.out.println("false       | false     | " + (false && !false));
		
		// Entrada do usuário
		Scanner sc = new Scanner(System.in);
		System.out.println("O sinal está verde? (true/false): ");
		boolean sinalVerde = sc.nextBoolean();
		System.out.println("Há pedestres atravessando? (true/false): ");
		boolean pedestres = sc.nextBoolean();
		
		//Processamento
		boolean podeAtravessar = sinalVerde && !pedestres; // Condição de atravessar o semáforo
		
		// Saída
		System.out.println("Pode atravessar o cruzamento? " + podeAtravessar);
		
		sc.close();
	}
}
