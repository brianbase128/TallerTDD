
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
	public void test() throws Exception {
		assertEquals(0, calc.valor());
	}

	@Test
	public void sumar_5_mas_2_es_7() throws Exception {
		calc.sumar(1, 1);
		assertEquals(7, calc.resultado());
	}

}
