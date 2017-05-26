package listas_array;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import clases.Habitacion;
import clases.HabitacionDoble;
import clases.HabitacionSuite;
import clases.HabitacionTriple;

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
		
		public int tamaño(){
			return ListaHabitaciones.size();
		}
		
		public void adicionar(Habitacion x){
			ListaHabitaciones.add(x);
		}
		
		public void eliminar(Habitacion x){
			ListaHabitaciones.remove(x);
		}
		
		public Habitacion obtener(int pos){
			return ListaHabitaciones.get(pos);
		}
		public Habitacion HabitacionOcupada(){
			ListaHabitaciones.get(i).ocupadoONO=true;
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
				ListaHabitaciones.add(new HabitacionDoble(i+1,false, 300));
			}
		}
		public void CargarListaHabTriple(){
			for(int i=56; i<91;i++){
				ListaHabitaciones.add(new HabitacionTriple(i+1,false, 400));
			}
		}
		public void CargarListaHabSuite(){
			for(int i=92; i<102;i++){
				ListaHabitaciones.add(new HabitacionSuite(i+1,false, 600));
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
