package clases;

public class Reservas {
	/// dia 
	public int dia;
    public int mes;
    public int anio;
    ///hora
    public int hora;
    public int minutos;
    public Persona cliente;
    public int nroReserva;
    public int tipoHabitacion; /// 1 suite, 2 doble, 3 triple.
    
    public Reservas(int dia, int mes, int anio, int hora, int minutos, int nroReserva, int tipoHabitacion) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
        this.minutos = minutos;
        this.nroReserva = nroReserva;
        this.tipoHabitacion=tipoHabitacion;
        cliente=null;
    }

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
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