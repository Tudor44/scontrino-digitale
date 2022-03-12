package it.gdsoftware.scontrino.xml70.core.segnalazione;

import it.gdsoftware.scontrino.xml70.jaxb.SegnalazioneType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Optional;

public class Segnalazione {

    private String matricola;
    private XMLGregorianCalendar dataOra;
    private String codice;
    private Optional<String> note;

    public Segnalazione(){}

    public Segnalazione(String matricola, XMLGregorianCalendar dataOra, String codice, Optional<String> note) {
        this.matricola = matricola;
        this.dataOra = dataOra;
        this.codice = codice;
        this.note = note;
    }

    public Segnalazione(String matricola, XMLGregorianCalendar dataOra, String codice) {
        this.matricola = matricola;
        this.dataOra = dataOra;
        this.codice = codice;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public XMLGregorianCalendar getDataOra() {
        return dataOra;
    }

    public void setDataOra(XMLGregorianCalendar dataOra) {
        this.dataOra = dataOra;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public Optional<String> getNote() {
        return note;
    }

    public void setNote(Optional<String> note) {
        this.note = note;
    }

    public SegnalazioneType creaSegnalazione(){
        SegnalazioneType segnalazioneType = new SegnalazioneType();
        segnalazioneType.setCodice(codice);
        segnalazioneType.setMatricola(matricola);
        segnalazioneType.setDataOra(dataOra);
        if(Optional.ofNullable(note).isPresent())
            segnalazioneType.setNote(note.get());
        return segnalazioneType;
    }
}
