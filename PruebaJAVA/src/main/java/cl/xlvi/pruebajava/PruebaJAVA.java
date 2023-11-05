package cl.xlvi.pruebajava;

import cl.xlvi.pruebajava.DTO.Service.Service.Impl.vehiculoService;
import cl.xlvi.pruebajava.DTO.Service.cargaDTO;
import cl.xlvi.pruebajava.DTO.Service.pasajeroDTO;



public class PruebaJAVA {

    public static void main(String[] args) 
    {
        //|Carga----------------------------------------------------------------------------------------------------|
        
        cargaDTO Carga1 = new cargaDTO(12, 1200, 12, "GTCC55");
        cargaDTO Carga2 = new cargaDTO(8, 800, 9, "ABC123");
        cargaDTO Carga3 = new cargaDTO(15, 1500, 18, "XYZ789");
        cargaDTO Carga4 = new cargaDTO(10, 1000, 14, "DEF456");
        cargaDTO Carga5 = new cargaDTO(9, 900, 11, "JKL321");
        cargaDTO Carga6 = new cargaDTO(11, 1100, 13, "JKL321");                    //Patente repetida
        cargaDTO Carga7 = new cargaDTO(14, 1400, 16, "JKL321");                    //Patente repetida
        cargaDTO Carga8 = new cargaDTO(7, 700, 6, "UVW000");                       //Menos de 7 dias
        cargaDTO Carga9 = new cargaDTO(13, 1300, 15, "LMN222");
        cargaDTO Carga10 = new cargaDTO(6, 600, 7, "HIJ999");
        
        //|Pasajero-------------------------------------------------------------------------------------------------|
       
        pasajeroDTO Pasajero1 = new pasajeroDTO(4, 60000, 8, "GTCC56");
        pasajeroDTO Pasajero2 = new pasajeroDTO(3, 45000, 7, "ABC124");
        pasajeroDTO Pasajero3 = new pasajeroDTO(6, 75000, 10, "XYZ790");
        pasajeroDTO Pasajero4 = new pasajeroDTO(5, 55000, 9, "DEF457");
        pasajeroDTO Pasajero5 = new pasajeroDTO(2, 30000, 6, "JKL322");      //Menos de 7 dias 
        pasajeroDTO Pasajero6 = new pasajeroDTO(7, 85000, 11, "MNO655");
        pasajeroDTO Pasajero7 = new pasajeroDTO(8, 90000, 12, "PQR988");
        pasajeroDTO Pasajero8 = new pasajeroDTO(1, 15000, 5, "HIJ990");      //Menos de 7 dias      
        pasajeroDTO Pasajero9 = new pasajeroDTO(9, 95000, 13, "HIJ990");     //Patente repetida
        pasajeroDTO Pasajero10 = new pasajeroDTO(10, 100000, 14, "HIJ990");  //Patente repetida
         
        //|Agregar Carga--------------------------------------------------------------------------------------------|
        vehiculoService.agregarVehiculo(Carga1);
        vehiculoService.agregarVehiculo(Carga2);
        vehiculoService.agregarVehiculo(Carga3);
        vehiculoService.agregarVehiculo(Carga4);
        vehiculoService.agregarVehiculo(Carga5);
        vehiculoService.agregarVehiculo(Carga6);
        vehiculoService.agregarVehiculo(Carga7);
        vehiculoService.agregarVehiculo(Carga8);
        vehiculoService.agregarVehiculo(Carga9);
        vehiculoService.agregarVehiculo(Carga10);
        
        //|Agregar Pasajero-----------------------------------------------------------------------------------------|
        vehiculoService.agregarVehiculo(Pasajero1);
        vehiculoService.agregarVehiculo(Pasajero2);
        vehiculoService.agregarVehiculo(Pasajero3);
        vehiculoService.agregarVehiculo(Pasajero4);
        vehiculoService.agregarVehiculo(Pasajero5);
        vehiculoService.agregarVehiculo(Pasajero6);
        vehiculoService.agregarVehiculo(Pasajero7);
        vehiculoService.agregarVehiculo(Pasajero8);
        vehiculoService.agregarVehiculo(Pasajero9);
        vehiculoService.agregarVehiculo(Pasajero10);
        
        System.out.println("--------------------------------------------------------------------------------------");
        
        System.out.println("Listado Vehiculo Carga: ");
        
        //|Mostrar detalle Carga------------------------------------------------------------------------------------|
        System.out.println(Carga1.mostrarDetalle());
        System.out.println(Carga2.mostrarDetalle());
        System.out.println(Carga3.mostrarDetalle());
        System.out.println(Carga4.mostrarDetalle());
        System.out.println(Carga5.mostrarDetalle());
        System.out.println(Carga6.mostrarDetalle());
        System.out.println(Carga7.mostrarDetalle());
        System.out.println(Carga8.mostrarDetalle());
        System.out.println(Carga9.mostrarDetalle());
        System.out.println(Carga10.mostrarDetalle());
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------");
        
        System.out.println("Listado Vehiculo Pasajero: ");
        
        //|Mostrar detalle Pasajero---------------------------------------------------------------------------------|
        System.out.println(Pasajero1.mostrarDetalle());
        System.out.println(Pasajero2.mostrarDetalle());
        System.out.println(Pasajero3.mostrarDetalle());
        System.out.println(Pasajero4.mostrarDetalle());
        System.out.println(Pasajero5.mostrarDetalle());
        System.out.println(Pasajero6.mostrarDetalle());
        System.out.println(Pasajero7.mostrarDetalle());
        System.out.println(Pasajero8.mostrarDetalle());
        System.out.println(Pasajero9.mostrarDetalle());
        System.out.println(Pasajero10.mostrarDetalle());
        
        //|Contador de vehiculos con dias mayores a 7)--------------------------------------------------------------|
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Canitadad de vehiculos con 7 dias o mas de arriendo: " + vehiculoService.mayorQ());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");
    } 
}