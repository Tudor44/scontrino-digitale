package it.gdsoftware.scontrino.xml70.core.periodoinattivo;

import javax.xml.datatype.XMLGregorianCalendar;

import it.gdsoftware.scontrino.xml70.jaxb.PeriodoInattivoType;

public class PeriodoInattivo {

	private XMLGregorianCalendar dal;
	private XMLGregorianCalendar al;
	
	public PeriodoInattivo(XMLGregorianCalendar dal, XMLGregorianCalendar al) {
		this.dal = dal;
		this.al = al;
	}
	
	public PeriodoInattivoType creaPeriodoInattivo() {
		PeriodoInattivoType periodoInattivo = new PeriodoInattivoType();
		periodoInattivo.setDal(al);
		periodoInattivo.setAl(al);
		return periodoInattivo;
	}
	

}
