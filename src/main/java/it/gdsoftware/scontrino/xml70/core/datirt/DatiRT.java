package it.gdsoftware.scontrino.xml70.core.datirt;

import it.gdsoftware.scontrino.xml70.jaxb.ElencoCorrispettiviType;

import java.util.List;

public class DatiRT {

    private List<Riepilogo> riepiloghi;
    private Totali totali;

    public DatiRT(){}

    public DatiRT(List<Riepilogo> riepiloghi, Totali totali) {
        this.riepiloghi = riepiloghi;
        this.totali = totali;
    }

    public void setRiepiloghi(List<Riepilogo> riepiloghi) {
        this.riepiloghi = riepiloghi;
    }

    public List<Riepilogo> riepiloghi() {
        return riepiloghi;
    }

    public Totali getTotali() {
        return totali;
    }

    public void setTotali(Totali totali) {
        this.totali = totali;
    }

    public ElencoCorrispettiviType creaDatiRT(){
        ElencoCorrispettiviType elencoCorrispettiviType = new ElencoCorrispettiviType();
        for(Riepilogo riepilogo : riepiloghi){
            elencoCorrispettiviType.getRiepilogo().add(riepilogo.creaRiepilogo());
        }
        elencoCorrispettiviType.setTotali(totali.creaTotali());
        return elencoCorrispettiviType;
    }
}
