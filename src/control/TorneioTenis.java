package control;

import java.util.List;

public class TorneioTenis {
	
	public int calcularGrupo(List<String> resultados) {
		int totalDeVitorias = 0;
		
		for (int i = 0; i < resultados.size(); i++) {
			if (resultados.get(i).equals("V")) {
				totalDeVitorias++;
			}
		}
		
		if (totalDeVitorias >= 5) {
			return 1;
		}
		
		if (totalDeVitorias >= 3) {
			return 2;
		}
		
		if (totalDeVitorias >= 1) {
			return 3;
		}
		
		return -1;
	}
	
}
