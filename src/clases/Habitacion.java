package clases;

public class Habitacion {
	public int numeroHabitacion;
	public boolean ocupadoONO=false;
	public double costo;
	public int tipoHabitacion;
	
	public Habitacion (int numeroHabitacion, boolean ocupadoONO, double costo, int tipoHabitacion){
		this.numeroHabitacion=numeroHabitacion;
		this.ocupadoONO=ocupadoONO;
		this.costo=costo;
		this.tipoHabitacion=tipoHabitacion;
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
	
	public int getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(int tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
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
