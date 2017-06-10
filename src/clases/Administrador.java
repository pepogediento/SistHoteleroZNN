package clases;
import listas_array.ListaHabitacion;

public class Administrador {

	ListaHabitacion ListaHab;
	//Metodos
	
	//da nro de habitacion a la reserva
	
	int AsiganarHabitacionAReserva(Reservas res){
		Habitacion aux=null;
		
		for(int i=0; i<ListaHab.tamaño(); i++){
			
			if(ListaHab.obtener(i)instanceof Habitacion){
				if (res.tipoHabitacion==2){
					aux=ListaHab.obtener(i);
					ListaHab.HabitacionOcupada(i);
				}
			}
			if(ListaHab.obtener(i) instanceof Habitacion ){
				if (res.tipoHabitacion==3){
					aux=ListaHab.obtener(i);
					ListaHab.HabitacionOcupada(i);
				}
			}
			if(ListaHab.obtener(i) instanceof Habitacion){
				if (res.tipoHabitacion==1){
					aux=ListaHab.obtener(i);
					ListaHab.HabitacionOcupada(i);
				}
			}
			if(aux==null){
				System.out.println("No se encontro ninguna habitacion del tipo solicitado disponible");
			}
			
		}
		return aux.numeroHabitacion;
		
	}
	
	// 

}
