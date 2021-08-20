package maquinasDeCafe;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class TresMaquinasTest {

	@Test
	public void test() {
		MaquinaDeCafe maquinaEco = new MaquinaEconomica();
		MaquinaDeCafe maquinaEsta = new MaquinaEstafadora();
		MaquinaDeCafe maquinaPre = new MaquinaPremium();
		
		MaquinaDeCafe[] maquinas= new MaquinaDeCafe[3];
		
		maquinas[0] = maquinaEco;
		maquinas[1] = maquinaEsta;
		maquinas[2] = maquinaPre;
		
		for(MaquinaDeCafe cadaUna : maquinas) {
			System.out.println(cadaUna.servirCafe());
			//lo que hace este print es observar si 
			//el vaso que expendió la maquina tiene cafe (true)
			//o si el vaso no tiene cafe (false)
		}
		
		for(MaquinaDeCafe cadaUna : maquinas) {
			System.out.println(cadaUna.servirCafe());
			//si corremos por segunda vez, la maquina estafadora
			//cuando quiera dar el segundo vaso, estara vacio
			//por lo que su condicion sera False.
		}
		
	}

}
