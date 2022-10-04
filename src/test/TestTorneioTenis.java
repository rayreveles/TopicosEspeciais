//participantes que venceram 5 ou 6 jogos serão colocados no Grupo 1;
//participantes que venceram 3 ou 4 jogos serão colocados no Grupo 2;
//participantes que venceram 1 ou 2 jogos serão colocados no Grupo 3;
//participantes que não venceram nenhum jogo não serão convidados a continuar com os treinamentos.
package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import control.TorneioTenis;

public class TestTorneioTenis {

	TorneioTenis torneio;
	
	
	@Before
	public void setup() {
		torneio = new TorneioTenis();
	}
	
		// Venceram 5 ou 6 jogos serão colocados no Grupo 1
		@Test
		public void testGrupo1() {
			List<String> list = Arrays.asList("V","V","V","P","V","V");
			Assert.assertEquals(1, torneio.calcularGrupo(list));	
	}
		
		//Venceram 3 ou 4 jogos serão colocados no Grupo 2
		@Test
		public void testGrupo2() {
			List<String> list = Arrays.asList("V","V","P","P","V","V");
			Assert.assertEquals(2, torneio.calcularGrupo(list));	
		}
		
		//Venceram 1 ou 2 jogos serão colocados no Grupo 3
		@Test
		public void testGrupo3() {
			List<String> list = Arrays.asList("V","P","V","P","P","P");		
			Assert.assertEquals(3, torneio.calcularGrupo(list));	
		}
		
		//Não venceu nenhum jogo
		@Test
		public void testGrupoMenosUm() {
			List<String> list = Arrays.asList("P","P","P","P","P","P");	
			Assert.assertEquals(-1, torneio.calcularGrupo(list));
		
		}
}
	

	  

