package clases;

public class Habitacion {
	public int numeroHabitacion;
	public boolean ocupadoONO=false;
	public double costo;
	
	public Habitacion (int numeroHabitacion, boolean ocupadoONO, double costo){
		this.numeroHabitacion=numeroHabitacion;
		this.ocupadoONO=ocupadoONO;
		this.costo=costo;
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
	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
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
