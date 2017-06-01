package clases;

public class Reservas {
	/// fechas 
	public String fecha_ingreso;
	public String fecha_salida;
	public String fecha_reserva;
   
    public String cod_clie; //seria el cliente que toma la reserva, se busca en la lista mediante el codigo 
    public int nroReserva; //seria un codigo para buscar la reserva
    
    public int tipoHabitacion; /// 1 suite, 2 doble, 3 triple.
    public int numHab;
    
    public Reservas(String fecha_ingreso,String fecha_salida, String fecha_reserva, String cod_clie,int nroReserva, int tipoHabitacion, int numHab) {
      
    	this.fecha_ingreso=fecha_ingreso;
    	this.fecha_salida=fecha_salida;
    	this.fecha_reserva=fecha_reserva;
    	this.cod_clie=cod_clie;
        this.nroReserva = nroReserva;
        this.tipoHabitacion=tipoHabitacion;
        this.numHab=numHab;
    }


	

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}




	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}




	public String getFecha_salida() {
		return fecha_salida;
	}




	public void setFecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
	}




	public String getFecha_reserva() {
		return fecha_reserva;
	}




	public void setFecha_reserva(String fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}


	public int getNumHab() {
		return numHab;
	}


	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public String getCod_clie() {
		return cod_clie;
	}

	public void setCod_clie(String cod_clie) {
		this.cod_clie = cod_clie;
	}

	public int getNroReserva() {
		return nroReserva;
	}

	public void setNroReserva(int nroReserva) {
		this.nroReserva = nroReserva;
	}

	public int getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(int tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	

	
	
}