package ar.edu.unlam.pb2;

public abstract class MedioTransporte {

	private Double latitud;
	private Double longitud;

	public MedioTransporte(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public void actualizarCoordenadas(double latitud, double longitud) {
		this.longitud = longitud;
		this.latitud = latitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}
	
}
