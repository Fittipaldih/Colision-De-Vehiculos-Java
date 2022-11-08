package ar.edu.unlam.pb2;

public class Tren extends MedioTransporte{

	private Integer cantidadDeVagones;
	private Integer velocidadMaxima;
	private Integer cantidadDePasajerosPorVagon;

	public Tren(Integer cantidadDeVagones, int cantidadDePasajerosPorVagon, int velocidadMaxima, double latitud, double longitud) {
		super (latitud, longitud);
		this.cantidadDeVagones = cantidadDeVagones;
		this.velocidadMaxima = velocidadMaxima;
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	
	
	
}
