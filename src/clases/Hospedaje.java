package clases;

public class Hospedaje {

	
	private int cod_hos;
	private String cod_res;
	private int cod_cli;
	private int numHab;
	private int tipo;
	private String fech_ingr;
	private int estado;
	public Hospedaje(int cod_hos, String cod_res, int cod_cli, int numHab,
			 int tipo, String fech_ingr, int estado) {
		this.cod_hos = cod_hos;
		this.cod_res = cod_res;
		this.cod_cli = cod_cli;
		this.numHab = numHab;

		this.tipo = tipo;
		this.fech_ingr = fech_ingr;
		this.estado = estado;
	}
	public Hospedaje() {
		
	}
	public int getCod_hos() {
		return cod_hos;
	}
	public void setCod_hos(int cod_hos) {
		this.cod_hos = cod_hos;
	}
	public String getCod_res() {
		return cod_res;
	}
	public void setCod_res(String cod_res) {
		this.cod_res = cod_res;
	}
	public int getCod_cli() {
		return cod_cli;
	}
	public void setCod_cli(int cod_cli) {
		this.cod_cli = cod_cli;
	}
	public int getNumHab() {
		return numHab;
	}
	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getFech_ingr() {
		return fech_ingr;
	}
	public void setFech_ingr(String fech_ingr) {
		this.fech_ingr = fech_ingr;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	

	
}
