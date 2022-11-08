package ar.edu.unlam.pb2;

public class Moto extends MedioTransporte{

	private final Integer CANTIDAD_MAXIMA_PASAJEROS;
	private String patente;
	private Integer velMax;
	
	public Moto(String patente, Integer velMax, double latitud, double longitud) {
		super (latitud, longitud);
		this.CANTIDAD_MAXIMA_PASAJEROS = 2;
		this.patente = patente;
		this.velMax = velMax;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getVelocidadMaxima() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public Integer getCANTIDAD_MAXIMA_PASAJEROS() {
		return CANTIDAD_MAXIMA_PASAJEROS;
	}



}
