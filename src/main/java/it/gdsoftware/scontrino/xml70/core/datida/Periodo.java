package it.gdsoftware.scontrino.xml70.core.datida;

import it.gdsoftware.scontrino.xml70.jaxb.PeriodoType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

public class Periodo {

    private BigDecimal venduto;
    private BigDecimal vendutoContante;
    private BigDecimal vendutoNoContante;
    private BigDecimal incassato;
    private BigDecimal incassatoRicarica;
    private BigDecimal incassatoVendita;
    private BigDecimal totaleResoTubiResto;
    private BigDecimal totaleCaricatoTubiResto;
    private BigDecimal totaleResoManualeTubiResto;
    private BigDecimal totaleCaricatoManualeTubiResto;
    private XMLGregorianCalendar dataOraPrelievoPrec;
    private Integer progressivoPrelievo;

    public Periodo(BigDecimal venduto, BigDecimal vendutoContante, BigDecimal vendutoNoContante, BigDecimal incassato, BigDecimal incassatoRicarica, BigDecimal incassatoVendita, BigDecimal totaleResoTubiResto, BigDecimal totaleCaricatoTubiResto, BigDecimal totaleResoManualeTubiResto, BigDecimal totaleCaricatoManualeTubiResto, XMLGregorianCalendar dataOraPrelievoPrec, Integer progressivoPrelievo) {
        this.venduto = venduto;
        this.vendutoContante = vendutoContante;
        this.vendutoNoContante = vendutoNoContante;
        this.incassato = incassato;
        this.incassatoRicarica = incassatoRicarica;
        this.incassatoVendita = incassatoVendita;
        this.totaleResoTubiResto = totaleResoTubiResto;
        this.totaleCaricatoTubiResto = totaleCaricatoTubiResto;
        this.totaleResoManualeTubiResto = totaleResoManualeTubiResto;
        this.totaleCaricatoManualeTubiResto = totaleCaricatoManualeTubiResto;
        this.dataOraPrelievoPrec = dataOraPrelievoPrec;
        this.progressivoPrelievo = progressivoPrelievo;
    }

    public BigDecimal getVenduto() {
        return venduto;
    }

    public void setVenduto(BigDecimal venduto) {
        this.venduto = venduto;
    }

    public BigDecimal getVendutoContante() {
        return vendutoContante;
    }

    public void setVendutoContante(BigDecimal vendutoContante) {
        this.vendutoContante = vendutoContante;
    }

    public BigDecimal getVendutoNoContante() {
        return vendutoNoContante;
    }

    public void setVendutoNoContante(BigDecimal vendutoNoContante) {
        this.vendutoNoContante = vendutoNoContante;
    }

    public BigDecimal getIncassato() {
        return incassato;
    }

    public void setIncassato(BigDecimal incassato) {
        this.incassato = incassato;
    }

    public BigDecimal getIncassatoRicarica() {
        return incassatoRicarica;
    }

    public void setIncassatoRicarica(BigDecimal incassatoRicarica) {
        this.incassatoRicarica = incassatoRicarica;
    }

    public BigDecimal getIncassatoVendita() {
        return incassatoVendita;
    }

    public void setIncassatoVendita(BigDecimal incassatoVendita) {
        this.incassatoVendita = incassatoVendita;
    }

    public BigDecimal getTotaleResoTubiResto() {
        return totaleResoTubiResto;
    }

    public void setTotaleResoTubiResto(BigDecimal totaleResoTubiResto) {
        this.totaleResoTubiResto = totaleResoTubiResto;
    }

    public BigDecimal getTotaleCaricatoTubiResto() {
        return totaleCaricatoTubiResto;
    }

    public void setTotaleCaricatoTubiResto(BigDecimal totaleCaricatoTubiResto) {
        this.totaleCaricatoTubiResto = totaleCaricatoTubiResto;
    }

    public BigDecimal getTotaleResoManualeTubiResto() {
        return totaleResoManualeTubiResto;
    }

    public void setTotaleResoManualeTubiResto(BigDecimal totaleResoManualeTubiResto) {
        this.totaleResoManualeTubiResto = totaleResoManualeTubiResto;
    }

    public BigDecimal getTotaleCaricatoManualeTubiResto() {
        return totaleCaricatoManualeTubiResto;
    }

    public void setTotaleCaricatoManualeTubiResto(BigDecimal totaleCaricatoManualeTubiResto) {
        this.totaleCaricatoManualeTubiResto = totaleCaricatoManualeTubiResto;
    }

    public XMLGregorianCalendar getDataOraPrelievoPrec() {
        return dataOraPrelievoPrec;
    }

    public void setDataOraPrelievoPrec(XMLGregorianCalendar dataOraPrelievoPrec) {
        this.dataOraPrelievoPrec = dataOraPrelievoPrec;
    }

    public Integer getProgressivoPrelievo() {
        return progressivoPrelievo;
    }

    public void setProgressivoPrelievo(Integer progressivoPrelievo) {
        this.progressivoPrelievo = progressivoPrelievo;
    }

    public PeriodoType creaPeriodo(){
        PeriodoType periodoType = new PeriodoType();
        periodoType.setIncassato(incassato);
        periodoType.setIncassatoRicarica(incassatoRicarica);
        periodoType.setDataOraPrelievoPrec(dataOraPrelievoPrec);
        periodoType.setIncassatoVendita(incassatoVendita);
        periodoType.setProgressivoPrelievo(progressivoPrelievo);
        periodoType.setVenduto(venduto);
        periodoType.setVendutoContante(vendutoContante);
        periodoType.setVendutoNoContante(vendutoNoContante);
        periodoType.setTotaleCaricatoManualeTubiResto(totaleCaricatoManualeTubiResto);
        periodoType.setTotaleResoManualeTubiResto(totaleResoManualeTubiResto);
        periodoType.setTotaleResoTubiResto(totaleResoTubiResto);
        periodoType.setTotaleCaricatoTubiResto(totaleCaricatoTubiResto);
        return periodoType;
    }
}
