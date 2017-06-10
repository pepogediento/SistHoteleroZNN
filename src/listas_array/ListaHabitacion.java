package listas_array;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import clases.Habitacion;



public class ListaHabitacion {

		private ArrayList<Habitacion>ListaHabitaciones;
		private String             archivo;	

		public ListaHabitacion(String archivo) {
			
			ListaHabitaciones = new ArrayList<Habitacion>();
			this.archivo = archivo;
			cargarHab();
		}
		
		public String getArchivo() {
			return archivo;
		} 
		//.size
		public int tamaño(){
			return ListaHabitaciones.size();
		}
		//.add
		public void adicionar(Habitacion x){
			ListaHabitaciones.add(x);
		}
		//.remove
		public void eliminar(Habitacion x){
			ListaHabitaciones.remove(x);
		}
		//.get
		public Habitacion obtener(int pos){
			return ListaHabitaciones.get(pos);
		}
		
		public void HabitacionOcupada(int pos){
			ListaHabitaciones.get(pos).setOcupadoONO(true);
		}
		
		public Habitacion buscar(int num){
			for(Habitacion h:ListaHabitaciones)
				if(h.getNumeroHabitacion()== num){
					return h;
				} 
			return null;
		}
		
		public boolean existeArchivo() {
			File  f = new File(archivo);
			return f.exists();
		}
		
		
		public int codigoMayor(int cod){
			int codi=100;
			for (Habitacion c: ListaHabitaciones){
				if (c.getNumeroHabitacion()>cod)
					codi=c.getNumeroHabitacion();
			}
			return codi;
		}
		public double costoM(){
			
			double cm = 0;
	 		
			for(Habitacion h:ListaHabitaciones){
			if(h.getCosto()>cm){
				cm=h.getCosto();
			}	
			}
			return cm;
		}
		
		
		
		
		
		public double acum(){
			
			double ac=0;
			
			for(Habitacion h:ListaHabitaciones){
				ac+=h.getCosto();
			}
			return ac;
		}
		
		
	/*public Habitacion buscarhabi(String tipo,String ubicacion){
		
		
		for(Habitacion h:ListaHabitaciones){
			if(h.getTipo().equalsIgnoreCase(tipo) && h.getUbicacion().equalsIgnoreCase(ubicacion)){
				return h;
			} 
		}
		return  null;
	}*/
		
	// ---
		
		public void grabarHab() {
			try {
				PrintWriter  pw;
				String       linea;
				Habitacion       x;
				pw = new PrintWriter(new FileWriter(archivo));
				for (int i=0; i<tamaño(); i++) {
					x = obtener(i);
					linea = x.getNumeroHabitacion() + ";" + x.isOcupadoONO() + ";" +  x.getCosto();
					pw.println(linea);
				}
				pw.close();
			}
			catch(Exception e) {
			}
		}
		
		//cargar listas x tipo
		public void CargarListaHabdoble(){
			for(int i=0; i<55;i++){
				ListaHabitaciones.add(new Habitacion(i+1,false, 300, 2));
			}
		}
		public void CargarListaHabTriple(){
			for(int i=56; i<91;i++){
				ListaHabitaciones.add(new Habitacion(i+1,false, 400,3));
			}
		}
		public void CargarListaHabSuite(){
			for(int i=92; i<102;i++){
				ListaHabitaciones.add(new Habitacion(i+1,false, 600,1));
			}
		}

		
		// general para cargar la lista con los trews tipos de habitacin 
		public void cargarHab() {
			try {
				CargarListaHabdoble();
				CargarListaHabTriple();
				CargarListaHabSuite();
			}
			catch(Exception e) {
			}
		}		


	}
