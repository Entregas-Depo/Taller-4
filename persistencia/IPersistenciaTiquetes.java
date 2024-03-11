package uniandes.dpoo.aerolinea.persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

/**
 * Esta interfaz define las operaciones relacionadas con la persistencia de los tiquetes de la aerolíena (salvar y cargar)
 */
public interface IPersistenciaTiquetes
{
    String archivo = null;
	/**
     * Carga la información de los clientes y tiquetes vendidos por la aerolínea, y actualiza la estructura de objetos que se encuentra dentro de la aerolínea
     * @param archivo La ruta al archivo que contiene la información que se va a cargar
     * @param aerolinea La aerolínea dentro de la cual debe almacenarse la información
     * @throws IOException Se lanza esta excepción si hay problemas leyendo el archivo
     * @throws InformacionInconsistenteException Se lanza esta excepción si hay información inconsistente dentro del archivo, o entre el archivo y el estado de la aerolínea
     */
    public static void cargarTiquetes( String archivo, Aerolinea aerolinea ) throws IOException, InformacionInconsistenteException{
    try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
        while ((reader.readLine()) != null); 

    } catch (IOException e) {
        throw e;
    } catch (Exception e) {
        throw new InformacionInconsistenteException("Error al procesar la información del archivo", e);
    }
}


    /**
     * Salva en un archivo toda la información sobre los clientes y los tiquetes vendidos por la aerolínea 
     * @param archivo La ruta al archivo donde debe quedar almacenada la información
     * @param aerolinea La aerolínea que tiene la información que se quiere almacenar
     * @throws IOException Se lanza esta excepción si hay problemas escribiendo el archivo
     * @throws Throwable 
     */
    public default void salvarTiquetes( String archivo, Aerolinea aerolinea ) throws IOException, Throwable{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Cliente cliente : Aerolinea.getClientes()) {
                writer.write("Cliente: " + cliente.getIdentificador() + ", Saldo Pendiente: " + cliente.calcularSaldoPendiente());
                writer.newLine();
            }

            for (Tiquete tiquete : Aerolinea.getTiquetes()) {
                writer.write("Tiquete: " + tiquete.getInformacionTiquete());
                writer.newLine();
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable throwable) {
            throw throwable;
        }
    }
}