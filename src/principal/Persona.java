package principal;

public class Persona implements Comparable<Persona> {
	
	private String cedula;
	private double peso;
	
	public Persona(String cedula, double peso) {
		super();
		this.cedula = cedula;
		this.peso = peso;
	}
	
	public String getCedula() {
		return cedula;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Persona: \n" +
				"\tCedula: " + cedula + "\n" +
				"\tPeso: " + peso;
	}

	@Override            // instancia Persona p
	public int compareTo(Persona p) {
		if(this.peso > p.getPeso()) {
			return 1;
		}else {
			if(this.peso < p.getPeso()) {
				return -1;
			}else {
				return this.cedula.compareTo(p.getCedula());
			}
		}
	}
	

}
