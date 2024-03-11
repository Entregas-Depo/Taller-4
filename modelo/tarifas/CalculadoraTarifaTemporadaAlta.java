package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifaTemporadaAlta implements CalculadoraTarifas {
	protected int COSTO_POR_KM = 1000;
	
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
