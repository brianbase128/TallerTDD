
public class Calcular {

	private int resultado = 0;
	
	public int resultado() {
		return resultado;
	}
	
	public void sumar(int valorUno, int ValorDos) {
		resultado = valorUno + ValorDos;
	}

	public void restar(int ValorUno, int ValorDos) {
		resultado = ValorUno-ValorDos;
	}

	public void multiplicar(int multiplicando, int multiplicador) {
		resultado = multiplicando*multiplicador;
	}

	public void dividir(int dividendo, int divisor)throws Exception {
		resultado = dividendo/divisor;
	}

}
