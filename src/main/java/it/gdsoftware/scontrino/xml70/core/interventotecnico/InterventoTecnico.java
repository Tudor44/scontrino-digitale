package it.gdsoftware.scontrino.xml70.core.interventotecnico;

import it.gdsoftware.scontrino.xml70.jaxb.InterventoTecnicoType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Optional;

public class InterventoTecnico {

    private String cfTecnico;
    private IdIVALaboratorio idIVALaboratorio;
    private XMLGregorianCalendar dataOra;
    private String codice;
    private Optional<String> numeroSw;
    private Optional<XMLGregorianCalendar> dataRelease;
    private Optional<String> note;

    public InterventoTecnico(){}

    public InterventoTecnico(String cfTecnico, IdIVALaboratorio idIVALaboratorio, XMLGregorianCalendar dataOra, String codice) {
        this.cfTecnico = cfTecnico;
        this.idIVALaboratorio = idIVALaboratorio;
        this.dataOra = dataOra;
        this.codice = codice;
    }

    public InterventoTecnico(String cfTecnico, IdIVALaboratorio idIVALaboratorio, XMLGregorianCalendar dataOra, String codice, Optional<String> numeroSw, Optional<XMLGregorianCalendar> dataRelease, Optional<String> note) {
        this.cfTecnico = cfTecnico;
        this.idIVALaboratorio = idIVALaboratorio;
        this.dataOra = dataOra;
        this.codice = codice;
        this.numeroSw = numeroSw;
        this.dataRelease = dataRelease;
        this.note = note;
    }

    public String getCfTecnico() {
        return cfTecnico;
    }

    public void setCfTecnico(String cfTecnico) {
        this.cfTecnico = cfTecnico;
    }

    public IdIVALaboratorio getIdIVALaboratorio() {
        return idIVALaboratorio;
    }

    public void setIdIVALaboratorio(IdIVALaboratorio idIVALaboratorio) {
        this.idIVALaboratorio = idIVALaboratorio;
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

    public Optional<String> getNumeroSw() {
        return numeroSw;
    }

    public void setNumeroSw(Optional<String> numeroSw) {
        this.numeroSw = numeroSw;
    }

    public Optional<XMLGregorianCalendar> getDataRelease() {
        return dataRelease;
    }

    public void setDataRelease(Optional<XMLGregorianCalendar> dataRelease) {
        this.dataRelease = dataRelease;
    }

    public Optional<String> getNote() {
        return note;
    }

    public void setNote(Optional<String> note) {
        this.note = note;
    }

    public InterventoTecnicoType creaInterventoTecnico(){
        InterventoTecnicoType interventoTecnicoType = new InterventoTecnicoType();
        interventoTecnicoType.setCFTecnico(cfTecnico);
        if(Optional.ofNullable(idIVALaboratorio).isPresent())
            interventoTecnicoType.setIdIVALaboratorio(idIVALaboratorio.creaIdIVALaboratorio());
        interventoTecnicoType.setDataOra(dataOra);
        interventoTecnicoType.setCodice(codice);
        if(Optional.ofNullable(numeroSw).isPresent())
            interventoTecnicoType.setNumeroSw(numeroSw.get());
        if(Optional.ofNullable(dataRelease).isPresent())
            interventoTecnicoType.setDataRelease(dataRelease.get());
        if(Optional.ofNullable(note).isPresent())
            interventoTecnicoType.setNote(note.get());
        return interventoTecnicoType;
    }
}
