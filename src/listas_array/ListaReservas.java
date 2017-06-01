package listas_array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import clases.Persona;
import clases.Reservas;

public class ListaReservas {
	private ArrayList<Reservas> res;
	private String       archivo;


	public ListaReservas(String archivo) {
		res = new ArrayList<Reservas>();
		this.archivo = archivo;
		cargarReserva();
	}


	public String getArchivo() {
		return archivo;
	}
	
	
	public int tamanio(){
		return res.size();
	}
	
	public void adicionar(Reservas c){
		res.add(c);
	}
	
	public void eliminar(Persona x){
		res.remove(x);
	}
	
	public Reservas obtener(int i){
		return res.get(i);
	}
	
	public Reservas buscar(int codigo){
		for(Reservas r:res)
			if(r.getNroReserva()== codigo){
				return r;
			} 
		return null;
	}
	
	
	public boolean existeArchivo() {
		File  f = new File(archivo);
		return f.exists();
	}

	public Reservas Fech(String n,String m){
		
		for(Reservas r : res){
			if(r.getFech_ingr().compareTo(n)==0 && r.getFech_sal().compareTo(m)==0){
				
				return r;
				
			}
		}
		return null;
	}
	
	public void grabarReserva() {
		try {
			PrintWriter  pw;
			String       linea;
			Reservas       x;
			pw = new PrintWriter(new FileWriter(archivo));
			for (int i=0; i<tamanio(); i++) {
				x = obtener(i);
				linea = x.getNroReserva() + ";" +
						x.getCod_clie() + ";" +
					    x.getNumhab() + ";" +
					    x.getFech_reg() + ";" +
					    x.getFech_ingr() + ";" +
					    x.getFech_sal() + ";" +
					    x.getEstado();
				pw.println(linea);
			}
			pw.close();
		}
		catch(Exception e) {
		}
	}

	public void cargarReserva() {
		try {
			BufferedReader  br;
			String          linea, s[],codcli,fechre,fechin,fechsal,cosrecep,numhab;
			int             codres,codcaj,estado;
			Reserva          res;
			br = new BufferedReader(new FileReader(archivo));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codres = Integer.parseInt(s[0].trim());
				codcli = s[1].trim();
				codcaj =  Integer.parseInt(s[2].trim());	
				cosrecep = s[3].trim();	
				numhab = s[4].trim();	
				fechre = s[5].trim();
				fechin = s[6].trim();
				fechsal = s[7].trim();
				estado = Integer.parseInt(s[8].trim());	
				
				
				res = new Reserva(codres,codcli,codcaj,cosrecep,numhab,fechre,fechin,fechsal,estado);
				adicionar(res);
			}
			br.close();
		}
		catch(Exception e) {
		}
	}


	public int codigoMayor(int i) {
		int codi=1000;
		for (Reserva c: res){
			if (c.getCod_res()>i)
				codi=c.getCod_res();
		}
		return codi;
	}
	
}
