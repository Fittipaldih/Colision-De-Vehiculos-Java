package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Mapa {

	private String nombreCiudad;
	private ArrayList <MedioTransporte> vehiculosTotales;
	
	public Mapa(String nombre) {
		nombreCiudad = nombre;
		vehiculosTotales = new ArrayList<>();
	}

	public boolean hayCoalicion() throws ColitionException {
		for (MedioTransporte medioTransporte : vehiculosTotales) {
			for (MedioTransporte medioTransporte2 : vehiculosTotales) {
				if (!medioTransporte.equals(medioTransporte2)) {
					if(medioTransporte.getLatitud().equals(medioTransporte2.getLatitud())
							&& medioTransporte.getLongitud().equals(medioTransporte2.getLongitud())) 
						throw new ColitionException();
					
				}
			}
		}
		return false;
	}
	


	public Integer getCantidadDeVehiculos() {
		return vehiculosTotales.size();
	}

	public void agregarVehiculo(MedioTransporte vehiculo) {
		vehiculosTotales.add(vehiculo);
	}

}
