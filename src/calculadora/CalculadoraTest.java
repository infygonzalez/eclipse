package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		
		Calculadora calculadora = new Calculadora(10,20);
		int result = calculadora.suma();
		assertEquals(30, result);
		
	}

	@Test
	public void testResta() {
		Calculadora calculadora = new Calculadora(30,10);
		int result = calculadora.resta();
		if(result != 20) {
			fail("Resultado no valido");
		}
	}

	@Test
	public void testMultiplicacon() {
		Calculadora calculadora = new Calculadora(3,10);
		int result = calculadora.multiplicacon();
		if(result != 30) {
			fail("Resultado no valido");
		}
	}

	@Test
	public void testDivision() {
		Calculadora calculadora = new Calculadora(10,2);
		int result = calculadora.division();
		assertEquals("Error error",5, result);
	
	}

}
