package it.gdsoftware.scontrino.xml70.core.datida;

import it.gdsoftware.scontrino.xml70.jaxb.DatiDistributoriAutomaticiType;

import java.util.Optional;

public class DatiDA {

    Optional<Periodo> periodo;
    Optional<Cumulato> cumulato;

    public DatiDA(){}

    public DatiDA(Optional<Periodo> periodo, Optional<Cumulato> cumulato) {
        this.periodo = periodo;
        this.cumulato = cumulato;
    }

    public Optional<Periodo> getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Optional<Periodo> periodo) {
        this.periodo = periodo;
    }

    public Optional<Cumulato> getCumulato() {
        return cumulato;
    }

    public void setCumulato(Optional<Cumulato> cumulato) {
        this.cumulato = cumulato;
    }

    public DatiDistributoriAutomaticiType creaDatiDA(){
        DatiDistributoriAutomaticiType datiDistributoriAutomaticiType = new DatiDistributoriAutomaticiType();
        if(Optional.ofNullable(periodo).isPresent())
            datiDistributoriAutomaticiType.setPeriodo(periodo.get().creaPeriodo());
        if(Optional.ofNullable(cumulato).isPresent())
            datiDistributoriAutomaticiType.setCumulato(cumulato.get().creaCumulato());
        return datiDistributoriAutomaticiType;
    }


}
