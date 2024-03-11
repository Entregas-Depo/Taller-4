package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	private String fecha;
	
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
	}
	public Ruta getRuta() {
		return null;
	}
	public String getFecha() {
		return null;
	}
	
	public Avion getAvion() {
		return null;
	}
	
	public Collection<Tiquete> getTiquetes() {
		return null;
		
	}
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		return 0;
	}
	public boolean equals(Object obj) {
		return false;
	}
	public int calcularValorTiquetes(int cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void registrarRealizacion() {
		// TODO Auto-generated method stub
		
	}
	public boolean hayEspacioDisponible(int cantidad) {
		// TODO Auto-generated method stub
		return false;
	}
	public void setFecha(String fecha) {
		fecha = this.fecha;
	}
}
