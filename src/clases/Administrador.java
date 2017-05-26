package clases;
import java.util.ArrayList;

import listas_array.ListaHabitacion;

public class Administrador {

	ListaHabitacion ListaHabitaciones;
	//Metodos
	
	//da nro de habitacion a la reserva
	
	Habitacion AsiganarHabitacionAReserva(Reservas res){
		Habitacion aux=null;
		
		for(int i=0; i<ListaHabitaciones.size(); i++){
			
			if(ListaHabitaciones.obtener(i) instanceof HabitacionDoble ){
				if (res.tipoHabitacion==2){
					aux=ListaHabitaciones.obtener(i);
					ListaHabitaciones.get(i).setisocupadoONO=true;
				}
			}
			if(ListaHabitaciones.obtener(i) instanceof HabitacionTriple ){
				if (res.tipoHabitacion==3){
					aux=ListaHabitaciones.obtener(i);
					ListaHabitaciones.get(i).ocupadoONO=true;
				}
			}
			if(ListaHabitaciones.get(i) instanceof HabitacionSuite){
				if (res.tipoHabitacion==1){
					aux=ListaHabitaciones.get(i);
					ListaHabitaciones.get(i).ocupadoONO=true;
				}
			}
			if(aux==null){
				System.out.println("No se encontro ninguna habitacion del tipo solicitado disponible");
			}
			
		}
		return aux;
		
	}
	
	// 

}
