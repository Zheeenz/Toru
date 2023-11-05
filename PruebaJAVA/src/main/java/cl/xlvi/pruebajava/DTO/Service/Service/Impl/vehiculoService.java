/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.xlvi.pruebajava.DTO.Service.Service.Impl;

import cl.xlvi.pruebajava.DTO.Service.vehiculosDTO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zhnz
 */
public class vehiculoService 
{
    public static List<vehiculosDTO> ListaVehiculo = new ArrayList<>();
    
    public static boolean verificarVehiculo(vehiculosDTO vehiculonuevo)
    {
        for (vehiculosDTO i : ListaVehiculo) 
        {
          if(i.getPatente() == vehiculonuevo.getPatente())
          {
            return false;
          }
        }
        return true;
    }
    
    public static void agregarVehiculo(vehiculosDTO vehiculonuevo)
    {
        if(verificarVehiculo(vehiculonuevo))
        {
            ListaVehiculo.add(vehiculonuevo);
            System.out.println("Correcto");
            return;
        }
        System.out.println("ERROR");
    }
    
    public static int mayorQ()
    {   
        int cantidadMayorQ = 0;
        for (vehiculosDTO i : ListaVehiculo) 
        {
          if(i.getDiasArriendo() >= 7)
          {
            cantidadMayorQ++;
          }
        }
        return cantidadMayorQ;
    }
}
