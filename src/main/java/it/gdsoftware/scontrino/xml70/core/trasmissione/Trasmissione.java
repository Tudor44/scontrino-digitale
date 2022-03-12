package it.gdsoftware.scontrino.xml70.core.trasmissione;

import it.gdsoftware.scontrino.xml70.jaxb.DatiTrasmissioneType;
import it.gdsoftware.scontrino.xml70.jaxb.FormatoTrasmissioneType;

import java.util.Optional;

public class Trasmissione {

	private FormatoTrasmissioneType formato;
	private long progressivo;
	private Optional<Dispositivo> dispositivo;

	public Trasmissione(){}

	public Trasmissione(FormatoTrasmissioneType formato, long progressivo) {
		this.formato = formato;
		this.progressivo = progressivo;
	}

	public Trasmissione(FormatoTrasmissioneType formato, long progressivo, Optional<Dispositivo> dispositivo){
		this.formato = formato;
		this.progressivo = progressivo;
		this.dispositivo = dispositivo;
	}
	
	public DatiTrasmissioneType creaTrasmissione() {
		DatiTrasmissioneType trasmissione = new DatiTrasmissioneType();
		trasmissione.setProgressivo(progressivo);
		trasmissione.setFormato(formato);
		if(Optional.ofNullable(dispositivo).isPresent())
			trasmissione.setDispositivo(dispositivo.get().creaDispositivo());
		return trasmissione;
	}

}
