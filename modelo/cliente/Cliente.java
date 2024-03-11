package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	public Cliente() {
	}
	public String getTipoCliente() {
		return null;
		
	}
	public String getIdentificador() {
		return null;
	}
	public void AgregarTiquete(Tiquete tiquete) {
	}
	public int calcularValorTotalTiquetes() {
		return 0;
	}
	public void usarTiquetes(Vuelo vuelo) {
	}
	public abstract String calcularSaldoPendiente();
	
}
