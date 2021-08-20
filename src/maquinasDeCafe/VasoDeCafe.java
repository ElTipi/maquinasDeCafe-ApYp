package maquinasDeCafe;

public class VasoDeCafe {

	private boolean lleno = false;
	
	public VasoDeCafe(boolean lleno) {
		this.lleno = lleno;
	}

	public boolean estaLleno() {
		return this.lleno;
	}

	//para que el vaso pueda ser impreso por consola
	//se le debe hacer el correspondiente toString
	//para que cuando se imprima (con un Syso) el objeto
	//en este caso un vaso. Pueda ser visto por sus
	//atributos y no por el nombre del objeto.
	
	@Override
	public String toString() {
		return "VasoDeCafe [lleno=" + lleno + "]";
	}
	
	
	
} 
