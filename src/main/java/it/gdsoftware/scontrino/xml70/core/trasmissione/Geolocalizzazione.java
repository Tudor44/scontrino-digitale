package it.gdsoftware.scontrino.xml70.core.trasmissione;

import java.math.BigDecimal;

import it.gdsoftware.scontrino.xml70.jaxb.GeoLocType;

public class Geolocalizzazione {
	
	private BigDecimal lat;
	private BigDecimal lon;
	
	
	public Geolocalizzazione(BigDecimal lat, BigDecimal lon) {
		this.lat = lat;
		this.lon = lon;
	}
	
	public GeoLocType creaGeolocalizzazione() {
		GeoLocType geolocalizazione = new GeoLocType();
		geolocalizazione.setLat(lat);
		geolocalizazione.setLong(lon);
		return geolocalizazione;
	}
	

}
