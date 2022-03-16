package it.gdsoftware.scontrino.xml70.core.datirt;

import it.gdsoftware.scontrino.xml70.jaxb.IVAType;

import java.math.BigDecimal;

public class IVA {

    private BigDecimal aliquotaIVA;
    private BigDecimal imposta;

    public BigDecimal getAliquotaIVA() {
        return aliquotaIVA;
    }

    public void setAliquotaIVA(BigDecimal aliquotaIVA) {
        this.aliquotaIVA = aliquotaIVA;
    }

    public BigDecimal getImposta() {
        return imposta;
    }

    public void setImposta(BigDecimal imposta) {
        this.imposta = imposta;
    }

    public IVAType creaIVA(){
        IVAType iva = new IVAType();
        iva.setAliquotaIVA(aliquotaIVA);
        iva.setImposta(imposta);
        return iva;
    }
}
