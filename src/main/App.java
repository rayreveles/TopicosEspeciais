package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import control.TorneioTenis;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> resultados = new ArrayList<String>();

		int totalDeJogos = 6;
		
		for (int i = 0; i < totalDeJogos; i++) {
			System.out.println("Insira o resultado do jogo " + (i+1) + ": ");
			String resultado = sc.nextLine();
			
			resultados.add(resultado);
		}
		
		TorneioTenis torneio = new TorneioTenis();
		
		int grupoResultante = torneio.calcularGrupo(resultados);
		
		System.out.println("Caiu no grupo " + grupoResultante);
		
		sc.close();
	}

}
