package maquinasDeCafe;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class maquinaPremiumTest {

	//declaramos maquina como una Maquina de Cafe
	MaquinaDeCafe maquina;
	
	@Before
	public void setup() {
		maquina = new MaquinaPremium();
		//inicializamos maquina como una maquina premium de cafe
	}

	@Test
	public void queDevuelveUnVasoAlServir() {
		VasoDeCafe vaso = maquina.servirCafe();
		Assert.assertNotNull(vaso);
	}
	
	@Test
	public void quePuedeServirUnCafe() {
		Assert.assertTrue(maquina.puedeServir());
	}
	
	@Test
	public void queSeAgotaElCafe() {
		for (int i = 0; i < 100; i++) {
			maquina.servirCafe();
		}
		Assert.assertFalse(maquina.puedeServir());		
	}
	
	@Test
	public void queLuegoDeAgotarElCafeSirveVasoVacio() {
		for (int i = 0; i < 100; i++) {
			maquina.servirCafe();
		}
		VasoDeCafe vaso = maquina.servirCafe();
		Assert.assertFalse(vaso.estaLleno());
	}
	
}
