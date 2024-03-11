package uniandes.dpoo.aerolinea.persistencia;

import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public interface IPersistenciaAerolinea {
	public  void cargarAerolinea(String archivo, Aerolinea aerolinea);
	
	public void salvarAerolineas(String archivo, Aerolinea aerolinea);
	
}
