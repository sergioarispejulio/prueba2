import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

FizzBuzz prueba;
	
	public FizzBuzzTest(){
		prueba = new FizzBuzz();
	}
	
	@Test
	public void truemultiplo3() {
		assertTrue(prueba.multiplo3(3));
	}
	
	@Test
	public void truemultiplo5() {
		assertTrue(prueba.multiplo5(5));
	}

	@Test
	public void falsemultiplo3() {
		assertFalse(prueba.multiplo3(2));
	}
	
	@Test
	public void falsemultiplo5() {
		assertFalse(prueba.multiplo5(3));
	}

	@Test
	public void devolverfizz(){
		assertEquals("Fizz", prueba.resultado(3));
	}
	
	@Test
	public void devolverbuzz(){
		assertEquals("Buzz", prueba.resultado(5));
	}

	@Test
	public void devolverfizzbuzz(){
		assertEquals("FizzBuzz", prueba.resultado(15));
	}
	
	@Test
	public void devolvernormal(){
		assertEquals(7, 7);
	}


}
