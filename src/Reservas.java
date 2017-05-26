public class Reservas {
	
    private int dia;
    private int mes;
    private int año;
     
    private int hora;
    private int minutos;
    Persona cliente;
    private int nroReserva;
    int tipoHabitacion; /// 1 suite, 2 doble, 3 triple.
    
    public Reservas(int dia, int mes, int año, int hora, int minutos, int nroReserva) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.minutos = minutos;
        this.nroReserva = nroReserva;
        cliente=null;
    }

}