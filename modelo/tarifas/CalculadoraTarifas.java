package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract interface CalculadoraTarifas {
    double IMPUESTO = 0.28;
    
    double calcularTarifa(Vuelo vuelo, Cliente cliente);

    int calcularCostoBase(Vuelo vuelo, Cliente cliente);

    double calcularPorcentajeDescuento(Cliente cliente);
    
    int calcularDistanciaVuelo(Ruta ruta);
    
    public int calcularValorImpuestos(int costoBase);
}