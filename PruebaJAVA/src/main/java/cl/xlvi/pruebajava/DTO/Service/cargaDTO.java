/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.xlvi.pruebajava.DTO.Service;


/**
 *
 * @author Zhnz
 */
public class cargaDTO extends vehiculosDTO
{
   private double cargaKilo;

    public double getCargaKilo() {
        return cargaKilo;
    }

    public void setCargaKilo(double cargaKilo) {
        this.cargaKilo = cargaKilo;
    }

    public cargaDTO()
    {
        this.cargaKilo = 0;
        //tipovehiculo = 1;
    }
    
    public cargaDTO(double cargaKilo)
    {
        this.cargaKilo = cargaKilo;
        //tipovehiculo = 1;
    }

    public cargaDTO(double cargaKilo, double precioArriendo, int diasArriendo, String patente) 
    {
        super(precioArriendo, diasArriendo, 1, patente);
        this.cargaKilo = cargaKilo;
    }

    @Override
    public double descuento() 
    {
        return precioArriendo*0.03;
    }

    @Override
    public String toString() 
    {
        return super.toString() + "\n Caraga Kilo: " + cargaKilo+ ".KG";
    }

    @Override
    public String mostrarDetalle() 
    {
        return super.mostrarDetalle()
                + "\n Tipo vehículo: Carga"
                + "\n Precio arriendo: " + "$" + precioArriendo + " "
                + "\n Descuento: " + "$" + descuento()
                + "\n Neto: " + precioArriendo
                + "\n Bruto: " + precioArriendo;
                // Valor IVA Neto*0.19
                // Bruto valor IVA + Neto(Neto = Neto *(1+19%) = 90*1.19)
    }
}
