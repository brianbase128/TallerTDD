
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalcularTest {

	private Calcular calc;

	@Before
	public void setUP() throws Exception {
		calc = new Calcular();
	}

	@Test
	public void sumar_5_mas_2_es_7() throws Exception {
		calc.sumar(5, 2);
		assertEquals(7, calc.resultado());
	}
	
	@Test
	public void sumar_5_mas_4_es_9() throws Exception {
		calc.sumar(5, 4);
		assertEquals(9, calc.resultado());
	}
	
	@Test
	public void restar_5_menos_2_es_3() throws Exception {
		calc.restar(5, 2);
		assertEquals(3, calc.resultado());
	}
	
	@Test
	public void restar_5_menos_6_es_menos1() throws Exception {
		calc.restar(5, 6);
		assertEquals(-1, calc.resultado());
	}

	@Test
	public void multiplicar_5_por_2_es_10() throws Exception {
		calc.multiplicar(5, 2);
		assertEquals(10, calc.resultado());
	}
	
	@Test
	public void multiplicar_5_por_menos10_es_menos50() throws Exception {
		calc.multiplicar(5, -10);
		assertEquals(-50, calc.resultado());
	}

	@Test
	public void dividir_10_dividido_10_es_1() throws Exception {
		calc.divir(10, 10);
//		assertEquals(-50, calc.resultado());
	}
	
}
