package it.gdsoftware.scontrino.xml70.main;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;

import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import it.gdsoftware.scontrino.xml70.core.Scontrino;
import it.gdsoftware.scontrino.xml70.jaxb.DatiCorrispettiviType;
import it.gdsoftware.scontrino.xml70.jaxb.FormatoTrasmissioneType;
import it.gdsoftware.scontrino.xml70.core.datida.DatiDA;
import it.gdsoftware.scontrino.xml70.core.datirt.DatiRT;
import it.gdsoftware.scontrino.xml70.core.datirt.Riepilogo;
import it.gdsoftware.scontrino.xml70.core.datirt.Totali;

import it.gdsoftware.scontrino.xml70.core.trasmissione.Trasmissione;
import javax.xml.namespace.QName;

public class Main {

	public static void main(String[] args) throws JAXBException, DatatypeConfigurationException {
                final String TIPOLOGIA = "DF";
		String azione = args[0];
		JAXBContext jaxbContext = JAXBContext.newInstance( DatiCorrispettiviType.class );

		//Crea un test per la creazione di un semplice corrispettivo di prova
		if(Costanti.TEST_CREA_SCONTRINO.equals(azione)){
			//Leggi i parametri per il nome file del corrispettivo
			String codicePaese = args[1];
			String piva = args[2];
			String progressivo = args[3];
			String pathToSave = args[4];
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			//<ns2:datiCorrispettiviType xmlns:ns2="http://www.w3.org/2000/09/xmldsig#" xmlns:ns3="http://ivaservizi.agenziaentrate.gov.it/docs/xsd/corrispettivi/dati/v1.0"></ns2:datiCorrispettiviType>
			Scontrino scontrino = new Scontrino();
			//<Trasmissione></Trasmissione>
			Trasmissione trasmissione = new Trasmissione(FormatoTrasmissioneType.COR_10, 1245);
			scontrino.setTrasmissione(trasmissione);

			//<dataOraRilevazione></dataOraRilevazione>
			final GregorianCalendar now = new GregorianCalendar();
			XMLGregorianCalendar dataOraRilevazione = DatatypeFactory.newInstance().newXMLGregorianCalendar(now);

			scontrino.setDataOraRilevazione(dataOraRilevazione);

			//<datiRT></datiRT>
			//Creo due voci di riepilogo di esempio
			Riepilogo riepilogo = new Riepilogo(new BigDecimal("123.10"),new BigDecimal("123.10"));
			Riepilogo riepilogo2 = new Riepilogo(new BigDecimal("3.10"),new BigDecimal("3.10"));
			List<Riepilogo> riepiloghi = new ArrayList<>();
			riepiloghi.add(riepilogo);
			riepiloghi.add(riepilogo2);
			//Creo un totale (2)
			Totali totali = new Totali(2);
			scontrino.setDatiRT(new DatiRT(riepiloghi, totali));
			//<datiDA></datiDA>
			Optional<DatiDA> datiDA = Optional.of(new DatiDA());
			scontrino.setDatiDA(datiDA);

			//FIRMA NON SUPPORTATA AL MOMENTO
			/*SignatureType signatureType = new SignatureType();
			scontrino.setSignature(signatureType);*/

			//Creazione da una cartella arbitraria
                        jaxbMarshaller.marshal(new JAXBElement<>(new QName("http://ivaservizi.agenziaentrate.gov.it/docs/xsd/corrispettivi/dati/v1.0","DatiCorrispettivi"), DatiCorrispettiviType.class, scontrino.creaScontrino()), new File(pathToSave+"/"+codicePaese+piva+"_"+TIPOLOGIA+"_"+progressivo+".xml"));

		}
		//Leggi tutti i corrispettivi xml da cartella arbitraria
		else if(Costanti.LEGGI_SCONTRINO.equals(azione)){
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			String pathToSave = args[1];
			File[] files = new File(pathToSave).listFiles((dir, name) -> name.endsWith(".xml"));
			for (File file : Objects.requireNonNull(files)){
                                JAXBElement<?> jAXBElement = (JAXBElement<?>) jaxbUnmarshaller.unmarshal(file);
                                DatiCorrispettiviType corrispettiviType = (DatiCorrispettiviType) jAXBElement.getValue();
				System.out.println(corrispettiviType.getDataOraRilevazione());
			}
		}
	}
}
