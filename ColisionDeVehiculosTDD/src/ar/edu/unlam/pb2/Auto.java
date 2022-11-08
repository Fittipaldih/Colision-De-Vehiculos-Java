package ar.edu.unlam.pb2;

public class Auto extends MedioTransporte {

	private String patente;
	private int cantidadMaxDePasajeros;
	private int velMax;


	public Auto(String patente, int cantidadMaxPasajeros, int velMax, double latitud, double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.cantidadMaxDePasajeros=cantidadMaxPasajeros;
		this.velMax = velMax;
	
	}


	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public Integer getCantidadMaxDePasajeros() {
		return cantidadMaxDePasajeros;
	}


	public void setCantidadMaxDePasajeros(int cantidadMaxDePasajeros) {
		this.cantidadMaxDePasajeros = cantidadMaxDePasajeros;
	}


	public Integer getVelocidadMaxima() {
		return velMax;
	}


	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

}
