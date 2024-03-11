package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	
	public Tiquete (String codigo, Vuelo vuelo, Cliente cliente, int tarifa) {
	}
	
	
	public Cliente getCliente() {
		return null;
	}
	
	public Vuelo getVuelo() {
		return null;
		
	}
	
	public String getCodigo() {
		return null;
		
	}
	
	public int getTarifa() {
		return 0;
		
	}
	
	
	
	public void marcarComoUsado() {
		return;
	}
	
	public boolean esUsado() {
		return false;
		
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getInformacionTiquete() {
		// TODO Auto-generated method stub
		return null;
	}
}
