//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.19 at 05:52:46 PM CEST 
//


package it.gdsoftware.scontrino.xml70.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PagatoTicket" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/corrispettivi/dati/v1.0}Amount2DecimalType"/>
 *         &lt;element name="NumeroTicket" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/corrispettivi/dati/v1.0}Integer15Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/corrispettivi/dati/v1.0", propOrder = {
    "pagatoTicket",
    "numeroTicket"
})
public class TicketType {

    @XmlElement(name = "PagatoTicket", required = true)
    protected BigDecimal pagatoTicket;
    @XmlElement(name = "NumeroTicket")
    protected long numeroTicket;

    /**
     * Gets the value of the pagatoTicket property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPagatoTicket() {
        return pagatoTicket;
    }

    /**
     * Sets the value of the pagatoTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPagatoTicket(BigDecimal value) {
        this.pagatoTicket = value;
    }

    /**
     * Gets the value of the numeroTicket property.
     * 
     */
    public long getNumeroTicket() {
        return numeroTicket;
    }

    /**
     * Sets the value of the numeroTicket property.
     * 
     */
    public void setNumeroTicket(long value) {
        this.numeroTicket = value;
    }

}
