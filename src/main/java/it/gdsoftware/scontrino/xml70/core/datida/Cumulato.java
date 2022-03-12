package it.gdsoftware.scontrino.xml70.core.datida;

import it.gdsoftware.scontrino.xml70.jaxb.CumulatoType;

import java.math.BigDecimal;

public class Cumulato {

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

    public Cumulato(BigDecimal venduto, BigDecimal vendutoContante, BigDecimal vendutoNoContante, BigDecimal incassato, BigDecimal incassatoRicarica, BigDecimal incassatoVendita, BigDecimal totaleResoTubiResto, BigDecimal totaleCaricatoTubiResto, BigDecimal totaleResoManualeTubiResto, BigDecimal totaleCaricatoManualeTubiResto) {
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

    public CumulatoType creaCumulato(){
        CumulatoType cumulato = new CumulatoType();
        cumulato.setIncassato(incassato);
        cumulato.setIncassatoRicarica(incassatoRicarica);
        cumulato.setIncassatoVendita(incassatoVendita);
        cumulato.setVenduto(venduto);
        cumulato.setVendutoNoContante(vendutoNoContante);
        cumulato.setVendutoContante(vendutoContante);
        cumulato.setTotaleCaricatoManualeTubiResto(totaleCaricatoManualeTubiResto);
        cumulato.setTotaleResoManualeTubiResto(totaleResoManualeTubiResto);
        cumulato.setTotaleCaricatoTubiResto(totaleCaricatoTubiResto);
        cumulato.setTotaleResoTubiResto(totaleResoTubiResto);
        return cumulato;
    }
}
