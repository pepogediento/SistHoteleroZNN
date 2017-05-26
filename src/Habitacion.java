
public class Habitacion {
	public int numeroHabitacion;
	public boolean ocupadoONO=false;
	
	public Habitacion (int numeroHabitacion, boolean ocupadoONO){
		this.numeroHabitacion=numeroHabitacion;
		this.ocupadoONO=ocupadoONO;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public boolean isOcupadoONO() {
		return ocupadoONO;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public void setOcupadoONO(boolean ocupadoONO) {
		this.ocupadoONO = ocupadoONO;
	}
	
	public String TranslateOcupada(){
		
		String traduccion;
		 
	    if(isOcupadoONO()==true){
	    	traduccion="Ocupada";
	    }else{
	    	traduccion="Habitacion no ocupada";
	    }
		return traduccion;
	    }
	
	

}
