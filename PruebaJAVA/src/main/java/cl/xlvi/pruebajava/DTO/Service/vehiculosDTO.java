/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.xlvi.pruebajava.DTO.Service;

import cl.xlvi.pruebajava.DTO.Service.Service.IVehiculos;

/**
 *
 * @author Zhnz
 */
public abstract class vehiculosDTO implements IVehiculos
{
    protected double precioArriendo;
    protected int diasArriendo;
    protected int tipovehiculo; //1: Carga| 2: Pasajero
    protected String patente;
    

    public double getPrecioArriendo() {
        return precioArriendo;
    }

    public void setPrecioArriendo(double precioArriendo) {
        this.precioArriendo = precioArriendo;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    public void setDiasArriendo(int diasArriendo) {
        this.diasArriendo = diasArriendo;
    }

    public int getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(int tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public vehiculosDTO() 
    {
        this.precioArriendo = 0;
        this.diasArriendo = 0;
        this.tipovehiculo = 0;
        this.patente = "";
    }
    
    public vehiculosDTO(double precioArriendo, int diasArriendo, int tipovehiculo, String patente) 
    {
        this.precioArriendo = precioArriendo;
        this.diasArriendo = diasArriendo;
        this.tipovehiculo = tipovehiculo;
        this.patente = patente;
    }

    @Override
    public abstract double descuento();
    
    @Override
    public String mostrarDetalle() 
    {
        return "\n ::: Detalle boleta  :::" 
                + "\n Cantidad dias arriendo: " + diasArriendo + " Dias "
                + "\n Patente: " + patente;
    }

    @Override
    public String toString() 
    {
        return "\n :::--vehiculo--:::" 
                + "\n Precio arriendo: " + "$" + precioArriendo + " "
                + "\n Cantidad dias arriendo: " + diasArriendo + " Dias "
                + "\n Tipo vehículo: " + tipovehiculo + " " 
                + "\n Patente: " + patente;
    }
}
