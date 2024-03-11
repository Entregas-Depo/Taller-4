package uniandes.dpoo.aerolinea.modelo;

import java.util.HashSet;
import java.util.Set;

import uniandes.dpoo.aerolinea.exceptions.AeropuertoDuplicadoException;

/**
 * Esta clase encapsula la información sobre los aeropuertos e implementa algunas operaciones relacionadas con la ubicación geográfica de los aeropuertos.
 * 
 * No puede haber dos aeropuertos con el mismo código.
 */
public class Aeropuerto
{
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private String codigo;
	private String nombreCiudad;
	@SuppressWarnings("unused")
	private double latitud;
	private double longitud;
	private static Set<String> codigosUtilizados = new HashSet<String>();
	private static int RADIO_TERRESTRE = 6371;
	
// encapsulación de datos bajo una instanciación imposible de corregir, no me fue posible solucionar esto mediante una importación correcta de datos :(
    /**
     * Este método calcula la distancia *aproximada* entre dos aeropuertos. Hay fórmulas más precisas pero esta es suficientemente buena para el caso de la aerolínea.
     * 
     * Este método asume que las coordenadas (latitud y longitud) de los aeropuertos están expresadas en la forma que las hace más cercanas. Si no es así, la distancia entre
     * los dos aeropuertos podría ser la más larga posible.
     * 
     * Por ejemplo, dependiendo de cómo estén expresadas las longitudes, la distancia calculada entre Narita (Tokyo) y El Dorado (Bogotá) podría ser atravesando el Pacífico, o
     * atravesando el Atlántico y Asia (el camino largo)
     * 
     * @param aeropuerto1
     * @param aeropuerto2
     * @return La distancia en kilómetros entre los puntos
     */
	

	public String ruta(String nombre,String codigo, String nombreCiudad, String latitud, String longitud) {
		return null;
	}
	
	public String getNombre() {
		return null;
	}
	
	public String getCodigo() {
		return null;
	}
	
	
	
	public String nombreCiudad() {
		return null;
	}
	
	public double getLatitud() {
		return 0;
	}
	
	public double getLongitud() {
		return 0;
	}
	
    public static int calcularDistancia( Aeropuerto aeropuerto1, Aeropuerto aeropuerto2 )
    {
        double latAeropuerto1 = Math.toRadians( aeropuerto1.getLatitud( ) );
        double lonAeropuerto1 = Math.toRadians( aeropuerto1.getLongitud( ) );
        double latAeropuerto2 = Math.toRadians( aeropuerto2.getLatitud( ) );
        double lonAeropuerto2 = Math.toRadians( aeropuerto2.getLongitud( ) );

        double deltaX = ( lonAeropuerto2 - lonAeropuerto1 ) * Math.cos( ( latAeropuerto1 + latAeropuerto2 ) / 2 );
        double deltaY = ( latAeropuerto2 - latAeropuerto1 );

        double distancia = Math.sqrt( deltaX * deltaX + deltaY * deltaY ) * RADIO_TERRESTRE;

        return ( int )Math.round( distancia );
    }

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Set<String> getCodigosUtilizados() {
		return codigosUtilizados;
	}

	public static void setCodigosUtilizados(Set<String> codigosUtilizados) {
		Aeropuerto.codigosUtilizados = codigosUtilizados;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

}
