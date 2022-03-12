package it.gdsoftware.scontrino.xml70.core.trasmissione;

import java.util.Optional;

import it.gdsoftware.scontrino.xml70.jaxb.DispositivoType;
import it.gdsoftware.scontrino.xml70.jaxb.TipoDispositivoType;

public class Dispositivo {

	private TipoDispositivoType tipo;
	private String idDispositivo;
	private Optional<Geolocalizzazione> geolocalizzazione;

	public Dispositivo(TipoDispositivoType tipo, String idDispositivo) {
		this.tipo = tipo;
		this.idDispositivo = idDispositivo;
	}
	
	public Dispositivo(TipoDispositivoType tipo, String idDispositivo, Geolocalizzazione geolocalizzazione) {
		this.tipo = tipo;
		this.idDispositivo = idDispositivo;
		this.geolocalizzazione = Optional.of(geolocalizzazione);
	}
	
	public DispositivoType creaDispositivo() {
		DispositivoType dispositivo = new DispositivoType();
		dispositivo.setTipo(tipo);
		dispositivo.setIdDispositivo(idDispositivo);
		if(Optional.ofNullable(geolocalizzazione).isPresent())
			dispositivo.setGeoLocalizzazione(geolocalizzazione.get().creaGeolocalizzazione());
		return dispositivo;
	}
	
}
