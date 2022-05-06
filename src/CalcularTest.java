
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalcularTest {

	@Test
	public void test() {
		Calcular calc = new Calcular();
		assertEquals(0, calc.valor());
	}
	
	@Test
	public void sumar() {
		Calcular calc = new Calcular();
		calc.sumar(1,1);
	}
	

}
