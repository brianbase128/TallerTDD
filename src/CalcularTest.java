
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
	public void sumar() throws Exception {
		calc.sumar(1, 1);
	}

}
