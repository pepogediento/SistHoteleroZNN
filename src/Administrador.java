import java.util.ArrayList;

public class Administrador {
	
	public ArrayList<Habitacion>ListaHabitaciones;
	
	public Administrador(){
		ListaHabitaciones=new ArrayList<Habitacion>();
	}
	
	//carga de lista
	
	void CargarListaHabdoble(){
		for(int i=0; i<55;i++){
			ListaHabitaciones.add(new HabitacionDoble(i+1,false));
		}
	}
	void CargarListaHabTriple(){
		for(int i=56; i<91;i++){
			ListaHabitaciones.add(new HabitacionTriple(i+1,false));
		}
	}
	void CargarListaHabSuite(){
		for(int i=92; i<102;i++){
			ListaHabitaciones.add(new HabitacionSuite(i+1,false));
		}
	}
	
	//Metodos
	
	Habitacion AsiganarHabitacionAReserva(Reservas res){
		Habitacion aux=null;
		
		for(int i=0; i<ListaHabitaciones.size(); i++){
			
			if(ListaHabitaciones.get(i) instanceof HabitacionDoble ){
				if (res.tipoHabitacion==2){
					aux=ListaHabitaciones.get(i);
					ListaHabitaciones.get(i).ocupadoONO=true;
				}
			}
			if(ListaHabitaciones.get(i) instanceof HabitacionTriple ){
				if (res.tipoHabitacion==3){
					aux=ListaHabitaciones.get(i);
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

}
