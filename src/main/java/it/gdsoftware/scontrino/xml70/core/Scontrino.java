package it.gdsoftware.scontrino.xml70.core;

import it.gdsoftware.scontrino.xml70.core.datida.DatiDA;
import it.gdsoftware.scontrino.xml70.core.datirt.DatiRT;
import it.gdsoftware.scontrino.xml70.core.interventotecnico.InterventoTecnico;
import it.gdsoftware.scontrino.xml70.core.periodoinattivo.PeriodoInattivo;
import it.gdsoftware.scontrino.xml70.core.segnalazione.Segnalazione;
import it.gdsoftware.scontrino.xml70.core.trasmissione.Trasmissione;
import it.gdsoftware.scontrino.xml70.jaxb.DatiCorrispettiviType;

import javax.swing.text.html.Option;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;
import java.util.Optional;

public class Scontrino {

    private Trasmissione trasmissione;
    private XMLGregorianCalendar dataOraRilevazione;
    private Optional<PeriodoInattivo> periodoInattivo;
    private DatiRT datiRT;
    private Optional<DatiDA> datiDA;
    private Optional<List<InterventoTecnico>> interventoTecnico;
    private Optional<List<Segnalazione>> segnalazione;

    public Scontrino(){}

    public Scontrino(Trasmissione trasmissione, XMLGregorianCalendar dataOraRilevazione, DatiRT datiRT) {
        this.trasmissione = trasmissione;
        this.dataOraRilevazione = dataOraRilevazione;
        this.datiRT = datiRT;
    }

    public Scontrino(Trasmissione trasmissione, XMLGregorianCalendar dataOraRilevazione, Optional<PeriodoInattivo> periodoInattivo, DatiRT datiRT, Optional<DatiDA> datiDA, Optional<List<InterventoTecnico>> interventoTecnico, Optional<List<Segnalazione>> segnalazione) {
        this.trasmissione = trasmissione;
        this.dataOraRilevazione = dataOraRilevazione;
        this.periodoInattivo = periodoInattivo;
        this.datiRT = datiRT;
        this.datiDA = datiDA;
        this.interventoTecnico = interventoTecnico;
        this.segnalazione = segnalazione;
    }

    public XMLGregorianCalendar getDataOraRilevazione() {
        return dataOraRilevazione;
    }

    public void setDataOraRilevazione(XMLGregorianCalendar dataOraRilevazione) {
        this.dataOraRilevazione = dataOraRilevazione;
    }

    public Trasmissione getTrasmissione() {
        return trasmissione;
    }

    public void setTrasmissione(Trasmissione trasmissione) {
        this.trasmissione = trasmissione;
    }

    public DatiRT getDatiRT() {
        return datiRT;
    }

    public void setDatiRT(DatiRT datiRT) {
        this.datiRT = datiRT;
    }

    public Optional<PeriodoInattivo> getPeriodoInattivo() {
        return periodoInattivo;
    }

    public void setPeriodoInattivo(Optional<PeriodoInattivo> periodoInattivo) {
        this.periodoInattivo = periodoInattivo;
    }

    public Optional<DatiDA> getDatiDA() {
        return datiDA;
    }

    public void setDatiDA(Optional<DatiDA> datiDA) {
        this.datiDA = datiDA;
    }

    public Optional<List<InterventoTecnico>> getInterventoTecnico() {
        return interventoTecnico;
    }

    public void setInterventoTecnico(Optional<List<InterventoTecnico>> interventoTecnico) {
        this.interventoTecnico = interventoTecnico;
    }

    public Optional<List<Segnalazione>> getSegnalazione() {
        return segnalazione;
    }

    public void setSegnalazione(Optional<List<Segnalazione>> segnalazione) {
        this.segnalazione = segnalazione;
    }

    public DatiCorrispettiviType creaScontrino(){
        DatiCorrispettiviType datiCorrispettiviType = new DatiCorrispettiviType();
        datiCorrispettiviType.setTrasmissione(trasmissione.creaTrasmissione());
        datiCorrispettiviType.setDataOraRilevazione(dataOraRilevazione);
        datiCorrispettiviType.setDatiRT(datiRT.creaDatiRT());
        if(Optional.ofNullable(datiDA).isPresent())
            datiCorrispettiviType.setDatiDA(datiDA.get().creaDatiDA());
        if(Optional.ofNullable(interventoTecnico).isPresent()){
            for(InterventoTecnico interventoTecnico : interventoTecnico.get())
                datiCorrispettiviType.getInterventoTecnico().add(interventoTecnico.creaInterventoTecnico());
        }
        if(Optional.ofNullable(segnalazione).isPresent()){
            for(Segnalazione segnalazione : segnalazione.get())
                datiCorrispettiviType.getSegnalazione().add(segnalazione.creaSegnalazione());
        }
        return datiCorrispettiviType;
    }


}
