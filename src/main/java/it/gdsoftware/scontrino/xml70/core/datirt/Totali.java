package it.gdsoftware.scontrino.xml70.core.datirt;

import it.gdsoftware.scontrino.xml70.jaxb.TotaliType;

import java.math.BigDecimal;
import java.util.Optional;

public class Totali {

    private Integer numeroDocCommerciali;
    private Optional<BigDecimal> pagatoContanti;
    private Optional<BigDecimal> pagatoElettronico;
    private Optional<BigDecimal> scontoApagare;
    private Optional<Ticket> ticket;

    public Totali(Integer numeroDocCommerciali) {
        this.numeroDocCommerciali = numeroDocCommerciali;
    }

    public Totali(Integer numeroDocCommerciali, Optional<BigDecimal> pagatoContanti, Optional<BigDecimal> pagatoElettronico, Optional<BigDecimal> scontoApagare, Optional<Ticket> ticket) {
        this.numeroDocCommerciali = numeroDocCommerciali;
        this.pagatoContanti = pagatoContanti;
        this.pagatoElettronico = pagatoElettronico;
        this.scontoApagare = scontoApagare;
        this.ticket = ticket;
    }

    public Integer getNumeroDocCommerciali() {
        return numeroDocCommerciali;
    }

    public void setNumeroDocCommerciali(Integer numeroDocCommerciali) {
        this.numeroDocCommerciali = numeroDocCommerciali;
    }

    public Optional<BigDecimal> getPagatoContanti() {
        return pagatoContanti;
    }

    public void setPagatoContanti(Optional<BigDecimal> pagatoContanti) {
        this.pagatoContanti = pagatoContanti;
    }

    public Optional<BigDecimal> getPagatoElettronico() {
        return pagatoElettronico;
    }

    public void setPagatoElettronico(Optional<BigDecimal> pagatoElettronico) {
        this.pagatoElettronico = pagatoElettronico;
    }

    public Optional<BigDecimal> getScontoApagare() {
        return scontoApagare;
    }

    public void setScontoApagare(Optional<BigDecimal> scontoApagare) {
        this.scontoApagare = scontoApagare;
    }

    public Optional<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(Optional<Ticket> ticket) {
        this.ticket = ticket;
    }

    public TotaliType creaTotali(){
        TotaliType totaliType = new TotaliType();
        totaliType.setNumeroDocCommerciali(numeroDocCommerciali);
        if(Optional.ofNullable(pagatoContanti).isPresent())
            totaliType.setPagatoContanti(pagatoContanti.get());
        if(Optional.ofNullable(pagatoElettronico).isPresent())
            totaliType.setPagatoElettronico(pagatoElettronico.get());
        if(Optional.ofNullable(scontoApagare).isPresent())
            totaliType.setScontoApagare(scontoApagare.get());
        if(Optional.ofNullable(ticket).isPresent())
            totaliType.setTicket(ticket.get().creaTicket());
        return totaliType;
    }


}
