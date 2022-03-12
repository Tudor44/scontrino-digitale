package it.gdsoftware.scontrino.xml70.core.datirt;

import it.gdsoftware.scontrino.xml70.jaxb.TicketType;

import java.math.BigDecimal;

public class Ticket {

    private BigDecimal pagatoTicket;
    private Integer numeroTicket;

    public Ticket(BigDecimal pagatoTicket, Integer numeroTicket) {
        this.pagatoTicket = pagatoTicket;
        this.numeroTicket = numeroTicket;
    }

    public BigDecimal getPagatoTicket() {
        return pagatoTicket;
    }

    public void setPagatoTicket(BigDecimal pagatoTicket) {
        this.pagatoTicket = pagatoTicket;
    }

    public Integer getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(Integer numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public TicketType creaTicket(){
        TicketType ticketType = new TicketType();
        ticketType.setNumeroTicket(numeroTicket);
        ticketType.setPagatoTicket(pagatoTicket);
        return ticketType;
    }
}
