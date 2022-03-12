//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.19 at 05:52:46 PM CEST 
//


package it.gdsoftware.scontrino.xml70.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElencoCorrispettiviType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElencoCorrispettiviType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Riepilogo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/corrispettivi/dati/v1.0}DatiRegistratoriTelematiciType" maxOccurs="40"/>
 *         &lt;element name="Totali" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/corrispettivi/dati/v1.0}TotaliType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElencoCorrispettiviType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/corrispettivi/dati/v1.0", propOrder = {
    "riepilogo",
    "totali"
})
public class ElencoCorrispettiviType {

    @XmlElement(name = "Riepilogo", required = true)
    protected List<DatiRegistratoriTelematiciType> riepilogo;
    @XmlElement(name = "Totali", required = true)
    protected TotaliType totali;

    /**
     * Gets the value of the riepilogo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riepilogo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiepilogo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatiRegistratoriTelematiciType }
     * 
     * 
     */
    public List<DatiRegistratoriTelematiciType> getRiepilogo() {
        if (riepilogo == null) {
            riepilogo = new ArrayList<DatiRegistratoriTelematiciType>();
        }
        return this.riepilogo;
    }

    /**
     * Gets the value of the totali property.
     * 
     * @return
     *     possible object is
     *     {@link TotaliType }
     *     
     */
    public TotaliType getTotali() {
        return totali;
    }

    /**
     * Sets the value of the totali property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotaliType }
     *     
     */
    public void setTotali(TotaliType value) {
        this.totali = value;
    }

}