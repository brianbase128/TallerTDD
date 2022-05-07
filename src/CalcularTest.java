
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

}
