package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public abstract class ClienteCorporativo extends Cliente	
{
	public static String CORPORATIVO = "corporativo";
    public static int GRANDE = 1;
    public static int MEDIANA = 2;
    public static int PEQUEÑA = 3;
    private String nombreEmpresa;
    private static int tamañoEmpresa;

    
    
    
    
    public void ClienteCorportativo(String nombreEmpresa, int tamaño) {
    }
    
    public String getNombreEmpresa() {
		return null;
    }
    
    
    public int getTamañoEmpresa() {
    	return 0;
    }

    public String getTipoCliente() {
		return null;
    }
    
    
    public String getIdentificador() {
		return null;
    }
    
    
    
    public ClienteCorporativo(String nombreEmpresa2, int tamañoEmpresa2) {
		// TODO Auto-generated constructor stub
	}

	/**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    
    
    public static ClienteCorporativo cargarDesdeJSON(JSONObject cliente) {
        String nombreEmpresa = cliente.getString("nombreEmpresa");
        
        int tamañoEmpresa = cliente.getInt("tamañoEmpresa");
        try {
            return new ClienteCorporativo(nombreEmpresa, tamañoEmpresa);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
// dadto incorregible mediante una creación de datos necesaria e imposible, no pude generar una solución concreta a este dato.
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public abstract JSONObject salvarEnJSON();
}
