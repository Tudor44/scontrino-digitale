# Scontrino Digitale
Libreria per la lettura e la creazione dei corrispettivi elettronici da Registratori Telematici

Aggiornata all'ultima specifica:
XMLcor Versione 7.0 ex art. 2, d.Lgs. 127/2015
[Clicca qui per i dettagli](https://www.agenziaentrate.gov.it/portale/documents/20143/288260/Allegato+-TipiDatiCorrispettivi-V7.0+-+giugno+2020-29032021.pdf/164190b4-883e-7c43-5b41-86dbb6389eb2)

E' una versione 0.1, quindi eventuali modifiche, contributi, richieste su misura e suggerimenti sono ben accetti.

Funzionalità di base:

1) Possibilità di creare un xml di prova con dati già impostati.
2) Possibilità di leggere ed estrarre i dati da xml presenti all'interno di una cartella arbitraria.
3) Supporto totale alla specifica. (Compresi i dati provenienti dai distributori automatici).


### Installazione per i test di prova
All'interno della cartella del progetto, lanciare da riga di comando: 
```
mvn clean
```

```
mvn install
```

La libreria è testata con Maven 3 e Java 8 (Da testare con le versioni più recenti).
Avvio creazione xml di prova:
```
java -jar scontrino-digitale-0.1.jar creaScontrino IT 99999999999 00001 ./xml
```

L'azione genera un file xml nominato IT_99999999999_DF_00001.xml, sotto la cartella indicata che viene indicata

Avvio lettura xml dei corrispettivi presenti in una cartella arbitraria:
```
java -jar scontrino-digitale-0.1.jar leggiScontrino ./xml
```

### Licenza
CC BY 4.0 
Tudor44