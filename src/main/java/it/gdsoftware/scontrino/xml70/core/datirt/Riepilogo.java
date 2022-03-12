package it.gdsoftware.scontrino.xml70.core.datirt;

import it.gdsoftware.scontrino.xml70.jaxb.DatiRegistratoriTelematiciType;
import it.gdsoftware.scontrino.xml70.jaxb.NaturaType;
import it.gdsoftware.scontrino.xml70.jaxb.VentilazioneIVAType;

import java.math.BigDecimal;
import java.util.Optional;

public class Riepilogo {

    private Optional<IVA> aliquotaIVA;
    private Optional<NaturaType> natura;
    private Optional<VentilazioneIVAType> ventilazioneIVA;
    private BigDecimal ammontare;
    private Optional<String> rifiNormativo;
    private BigDecimal importoParziale;
    private Optional<BigDecimal> totaleAmmontareResi;
    private Optional<BigDecimal> totaleAmmontareAnnulli;
    private Optional<BigDecimal> beniInSospeso;
    private Optional<BigDecimal> nonRiscossoServizi;
    private Optional<BigDecimal> nonRiscossoFatture;
    private Optional<BigDecimal> totaleDaFattureRT;
    private Optional<BigDecimal> nonRiscossoDCRaSSNM;
    private Optional<BigDecimal> nonRiscossoOmaggio;
    private Optional<Integer> codiceAttivita;

    public Riepilogo(BigDecimal ammontare, BigDecimal importoParziale) {
        this.ammontare = ammontare;
        this.importoParziale = importoParziale;
    }

    public Riepilogo(Optional<IVA> aliquotaIVA, Optional<NaturaType> natura, Optional<VentilazioneIVAType> ventilazioneIVA, BigDecimal ammontare, Optional<String> rifiNormativo, BigDecimal importoParziale, Optional<BigDecimal> totaleAmmontareResi, Optional<BigDecimal> totaleAmmontareAnnulli, Optional<BigDecimal> beniInSospeso, Optional<BigDecimal> nonRiscossoServizi, Optional<BigDecimal> nonRiscossoFatture, Optional<BigDecimal> totaleDaFattureRT, Optional<BigDecimal> nonRiscossoDCRaSSNM, Optional<BigDecimal> nonRiscossoOmaggio, Optional<Integer> codiceAttivita) {
        this.aliquotaIVA = aliquotaIVA;
        this.natura = natura;
        this.ventilazioneIVA = ventilazioneIVA;
        this.ammontare = ammontare;
        this.rifiNormativo = rifiNormativo;
        this.importoParziale = importoParziale;
        this.totaleAmmontareResi = totaleAmmontareResi;
        this.totaleAmmontareAnnulli = totaleAmmontareAnnulli;
        this.beniInSospeso = beniInSospeso;
        this.nonRiscossoServizi = nonRiscossoServizi;
        this.nonRiscossoFatture = nonRiscossoFatture;
        this.totaleDaFattureRT = totaleDaFattureRT;
        this.nonRiscossoDCRaSSNM = nonRiscossoDCRaSSNM;
        this.nonRiscossoOmaggio = nonRiscossoOmaggio;
        this.codiceAttivita = codiceAttivita;
    }

    public Optional<IVA> getAliquotaIVA() {
        return aliquotaIVA;
    }

    public void setAliquotaIVA(Optional<IVA> aliquotaIVA) {
        this.aliquotaIVA = aliquotaIVA;
    }

    public Optional<NaturaType> getNatura() {
        return natura;
    }

    public void setNatura(Optional<NaturaType> natura) {
        this.natura = natura;
    }

    public Optional<VentilazioneIVAType> getVentilazioneIVA() {
        return ventilazioneIVA;
    }

    public void setVentilazioneIVA(Optional<VentilazioneIVAType> ventilazioneIVA) {
        this.ventilazioneIVA = ventilazioneIVA;
    }

    public BigDecimal getAmmontare() {
        return ammontare;
    }

    public void setAmmontare(BigDecimal ammontare) {
        this.ammontare = ammontare;
    }

    public Optional<String> getRifiNormativo() {
        return rifiNormativo;
    }

    public void setRifiNormativo(Optional<String> rifiNormativo) {
        this.rifiNormativo = rifiNormativo;
    }

    public BigDecimal getImportoParziale() {
        return importoParziale;
    }

    public void setImportoParziale(BigDecimal importoParziale) {
        this.importoParziale = importoParziale;
    }

    public Optional<BigDecimal> getTotaleAmmontareResi() {
        return totaleAmmontareResi;
    }

    public void setTotaleAmmontareResi(Optional<BigDecimal> totaleAmmontareResi) {
        this.totaleAmmontareResi = totaleAmmontareResi;
    }

    public Optional<BigDecimal> getTotaleAmmontareAnnulli() {
        return totaleAmmontareAnnulli;
    }

    public void setTotaleAmmontareAnnulli(Optional<BigDecimal> totaleAmmontareAnnulli) {
        this.totaleAmmontareAnnulli = totaleAmmontareAnnulli;
    }

    public Optional<BigDecimal> getBeniInSospeso() {
        return beniInSospeso;
    }

    public void setBeniInSospeso(Optional<BigDecimal> beniInSospeso) {
        this.beniInSospeso = beniInSospeso;
    }

    public Optional<BigDecimal> getNonRiscossoServizi() {
        return nonRiscossoServizi;
    }

    public void setNonRiscossoServizi(Optional<BigDecimal> nonRiscossoServizi) {
        this.nonRiscossoServizi = nonRiscossoServizi;
    }

    public Optional<BigDecimal> getNonRiscossoFatture() {
        return nonRiscossoFatture;
    }

    public void setNonRiscossoFatture(Optional<BigDecimal> nonRiscossoFatture) {
        this.nonRiscossoFatture = nonRiscossoFatture;
    }

    public Optional<BigDecimal> getTotaleDaFattureRT() {
        return totaleDaFattureRT;
    }

    public void setTotaleDaFattureRT(Optional<BigDecimal> totaleDaFattureRT) {
        this.totaleDaFattureRT = totaleDaFattureRT;
    }

    public Optional<BigDecimal> getNonRiscossoDCRaSSNM() {
        return nonRiscossoDCRaSSNM;
    }

    public void setNonRiscossoDCRaSSNM(Optional<BigDecimal> nonRiscossoDCRaSSNM) {
        this.nonRiscossoDCRaSSNM = nonRiscossoDCRaSSNM;
    }

    public Optional<BigDecimal> getNonRiscossoOmaggio() {
        return nonRiscossoOmaggio;
    }

    public void setNonRiscossoOmaggio(Optional<BigDecimal> nonRiscossoOmaggio) {
        this.nonRiscossoOmaggio = nonRiscossoOmaggio;
    }

    public Optional<Integer> getCodiceAttivita() {
        return codiceAttivita;
    }

    public void setCodiceAttivita(Optional<Integer> codiceAttivita) {
        this.codiceAttivita = codiceAttivita;
    }

    public DatiRegistratoriTelematiciType creaRiepilogo(){
        DatiRegistratoriTelematiciType datiRegistratoriTelematiciType = new DatiRegistratoriTelematiciType();
        datiRegistratoriTelematiciType.setAmmontare(ammontare);
        datiRegistratoriTelematiciType.setImportoParziale(importoParziale);
        if(Optional.ofNullable(aliquotaIVA).isPresent())
            datiRegistratoriTelematiciType.setIVA(aliquotaIVA.get().creaIVA());
        if(Optional.ofNullable(natura).isPresent())
            datiRegistratoriTelematiciType.setNatura(natura.get());
        if(Optional.ofNullable(ventilazioneIVA).isPresent())
            datiRegistratoriTelematiciType.setVentilazioneIVA(ventilazioneIVA.get());
        if(Optional.ofNullable(rifiNormativo).isPresent())
            datiRegistratoriTelematiciType.setRifNormativo(rifiNormativo.get());
        if(Optional.ofNullable(totaleAmmontareResi).isPresent())
            datiRegistratoriTelematiciType.setTotaleAmmontareResi(totaleAmmontareResi.get());
        if(Optional.ofNullable(totaleAmmontareAnnulli).isPresent())
            datiRegistratoriTelematiciType.setTotaleAmmontareAnnulli(totaleAmmontareAnnulli.get());
        if(Optional.ofNullable(beniInSospeso).isPresent())
            datiRegistratoriTelematiciType.setBeniInSospeso(beniInSospeso.get());
        if(Optional.ofNullable(nonRiscossoServizi).isPresent())
            datiRegistratoriTelematiciType.setNonRiscossoServizi(nonRiscossoServizi.get());
        if(Optional.ofNullable(nonRiscossoFatture).isPresent())
            datiRegistratoriTelematiciType.setNonRiscossoFatture(nonRiscossoFatture.get());
        if(Optional.ofNullable(totaleDaFattureRT).isPresent())
            datiRegistratoriTelematiciType.setTotaleDaFattureRT(totaleDaFattureRT.get());
        if(Optional.ofNullable(nonRiscossoDCRaSSNM).isPresent())
            datiRegistratoriTelematiciType.setNonRiscossoDCRaSSN(nonRiscossoDCRaSSNM.get());
        if(Optional.ofNullable(nonRiscossoOmaggio).isPresent())
            datiRegistratoriTelematiciType.setNonRiscossoOmaggio(nonRiscossoOmaggio.get());
        if(Optional.ofNullable(codiceAttivita).isPresent())
            datiRegistratoriTelematiciType.setCodiceAttivita(codiceAttivita.get());
        return datiRegistratoriTelematiciType;
    }
}
