package be.odisee.jazzclub;

/**
 * Lid van de Jazzclub,
 *
 * heeft een lidnummer, paswoord en het aantal foute pogingen tot bekendmaking
 * die werden uitgevoerd sinds de laatste succesvolle bekendmaking
 */
public class Lid {

    private int lidnummer;
    private String paswoord;

    // REQ0007 Het aantal foute bekendmakingspogingen moet bijgehouden worden
    // REQ0003 Indien er voordien voor dit lidnummer teveel foute pogingen gebeurden, onstaat een foutconditie
    // REQ0004 Bij succesvolle bekendmaking wordt het aantal foute pogingen voor dat lid terug op nul gezet
    // REQ0006 Bij niet succesvolle bekendmaking, wordt het aantal pogingen voor dat lidnummer verhoogd als het bestaat
    private int aantalFoutePogingen;

    public int getLidnummer() {
        return lidnummer;
    }

    public void setLidnummer(int lidnummer) {
        this.lidnummer = lidnummer;
    }

    public String getPaswoord() {
        return paswoord;
    }

    public void setPaswoord(String paswoord) {
        this.paswoord = paswoord;
    }

    public int getAantalFoutePogingen() {
        return aantalFoutePogingen;
    }

    public void setAantalFoutePogingen(int aantalFoutePogingen) {
        this.aantalFoutePogingen = aantalFoutePogingen;
    }
}
