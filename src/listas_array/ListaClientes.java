package listas_array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import clases.Persona;


public class ListaClientes {
	
	private static ArrayList<Persona> cli;
	private String             archivo;	
	


	public ListaClientes(String archivo) {
		
		cli = new ArrayList<Persona>();
		this.archivo = archivo;
		cargarCliente();
	}
	
	public String getArchivo() {
		return archivo;
	}    

	public static int tamanio(){
		return cli.size();
	}
	
	public static void adicionar(Persona c){
		cli.add(c);
	}
	
	public void eliminar(Persona x){
		cli.remove(x);
	}
	
	public static Persona obtener(int i){
		return cli.get(i);
	}
	
	public Persona buscar(int codigo){
		for(Persona c:cli)
			if(c.getCodigo()== codigo){
				return c;
			} 
		return null;
	}

	public Persona busqueda(String Nombre,String apellido){
		for(Persona c:cli)
			if(c.getNombre().equalsIgnoreCase(Nombre) && c.getApellido().equalsIgnoreCase(apellido)){
				return c;
			} 
		return null;
	}


	
	public int codigoMayor(int cod){
		int codi=1000;
		for (Persona c: cli){
			if (c.getCodigo()>cod)
				codi=c.getCodigo();
		}
		return codi;
	}
// -------------------------------------------------------------
	
	public boolean existeArchivo() {
		File  f = new File(archivo);
		return f.exists();
	}
	
	public void grabarCliente() {
		try {
			PrintWriter  pw;
			String       linea;
			Persona       x;
			pw = new PrintWriter(new FileWriter(archivo));
			for (int i=0; i<tamanio(); i++) {
				x = obtener(i);
				linea = x.getCodigo() + ";" +
						x.getApellido() + ";" +
				        x.getNombre() + ";" +
					    x.getTelefono() + ";" +
					    x.getEstado();
				pw.println(linea);
			}
			pw.close();
		}
		catch(Exception e) {
		}
	}

	public void cargarCliente() {
		try {
			BufferedReader  br;
			String          linea, s[], nombre,apellido,telefono;
			int codigo;
			int estado;
			Persona cli;
			br = new BufferedReader(new FileReader(archivo));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codigo = Integer.parseInt(s[0].trim());
				apellido = s[1].trim();
				nombre = s[2].trim();
				telefono = s[3].trim();
				estado = Integer.parseInt(s[4].trim());				
				cli = new Persona(codigo,apellido,nombre,telefono,estado);
				adicionar(cli);
			}
			br.close();
		}
		catch(Exception e) {
		}
	}

}
