/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.xlvi.pruebajava.DTO.Service;

/**
 *
 * @author Zhnz
 */
public class pasajeroDTO extends vehiculosDTO
{
    private int cantidadPasajeros;

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public pasajeroDTO(int cantidadPasajeros) 
    {
        this.cantidadPasajeros = cantidadPasajeros;
        //tipovehiculo = 2;
    }
    
    public pasajeroDTO() 
    {
        this.cantidadPasajeros = 0;
        //tipovehiculo = 2;
    }

    public pasajeroDTO(int cantidadPasajeros, double precioArriendo, int diasArriendo, String patente) 
    {
        super(precioArriendo, diasArriendo, 2, patente);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public double descuento() 
    {
        return precioArriendo*0.07;
    }
    
    
    
    @Override
    public String toString() 
    {
        return super.toString() +"\n Cantidad Pasajeros: " + cantidadPasajeros ;
    }

    @Override
    public String mostrarDetalle() 
    {
        return super.mostrarDetalle() + "\n Tipo vehículo: Pasajero" 
                                      + "\n Descuento: " + "$" +descuento() * IVA;
    }
}
