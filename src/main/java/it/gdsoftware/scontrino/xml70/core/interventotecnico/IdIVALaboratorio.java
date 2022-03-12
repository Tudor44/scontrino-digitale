package it.gdsoftware.scontrino.xml70.core.interventotecnico;

import it.gdsoftware.scontrino.xml70.jaxb.IdFiscaleType;

public class IdIVALaboratorio {

    private String idPaese;
    private String idCodice;

    public IdIVALaboratorio(String idPaese, String idCodice) {
        this.idPaese = idPaese;
        this.idCodice = idCodice;
    }

    public String getIdPaese() {
        return idPaese;
    }

    public void setIdPaese(String idPaese) {
        this.idPaese = idPaese;
    }

    public String getIdCodice() {
        return idCodice;
    }

    public void setIdCodice(String idCodice) {
        this.idCodice = idCodice;
    }

    public IdFiscaleType creaIdIVALaboratorio(){
        IdFiscaleType idFiscaleType = new IdFiscaleType();
        idFiscaleType.setIdCodice(idCodice);
        idFiscaleType.setIdPaese(idPaese);
        return idFiscaleType;
    }
}