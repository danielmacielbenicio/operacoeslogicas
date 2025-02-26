package operacoes;

import java.util.Scanner;

public class GuardaChuva {

	public static void main(String[] args) {
		// Tabela-verdade do operador AND
		System.out.println("Tabela-verdade do operador OR:");
		System.out.println("Chovendo    | Precisão Chuva | Levar Guarda-Chuva");
		System.out.println("true        | true      	 | " + (true || true));
		System.out.println("true        | false     	 | " + (true || false));
		System.out.println("false       | true      	 | " + (false || true));
		System.out.println("false       | false     	 | " + (false || false));
		
		// Entrada do usuário
		Scanner sc = new Scanner(System.in);
		System.out.println("Está chovendo agora?(true/false): ");
		boolean chovendo = sc.nextBoolean();
		System.out.println("A previsão indica chuva? (true/false): ");
		boolean previsaoChuva = sc.nextBoolean();
		
		//Processamento
		boolean levarGuardaChuva = chovendo || previsaoChuva; // Condição de atravessar o semáforo
		
		// Saída
		System.out.println("Devo levar o guarda-chuva? " + levarGuardaChuva);
		
		sc.close();
	}
}
