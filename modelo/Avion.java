package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	private String nombre;
	private String capacidad;
	
	public Avion(String nombre, String capacidad) {
		this.setNombre(nombre);
		this.setCapacidad(capacidad);
	}
	public String getnombre() {
	    return null;
	}
	public int getCapacidad() {
		return 0;
	}
	public boolean estaDisponible(String fecha) {
		// TODO Auto-generated method stub
		return false;
	}
	public void marcarOcupado(String fecha) {
		// TODO Auto-generated method stub
		
	}
	public void setCapacidad(String capacidad) {
		capacidad = this.capacidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre = this.nombre;
	}
}