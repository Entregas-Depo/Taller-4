package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja implements CalculadoraTarifas {
	protected int COSTO_POR_KM_NATURAL = 600;
	protected int COSTO_POR_KM_OPERATIVO = 900;
	protected double DESCUENTO_PEQ = 0.02;
	protected double DESCUENTO_MEDIANAS = 0.1;
	protected double DESCUENTO_GRANDES = 0.2;
	
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
		
	}
	
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
		
	}

	@Override
	public double calcularTarifa(Vuelo vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calcularDistanciaVuelo(Ruta ruta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calcularValorImpuestos(int costoBase) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
