public class CloudStorage implements ICloudService{
    private String nazev;
    private double cenaZaGB;
    private int pocetSpusteni = 0;

    public CloudStorage(String nazev, double cenaZaGB) {
        this.nazev = nazev;
        this.cenaZaGB = cenaZaGB;
    }

    @Override
    public void spustSluzbu() {
        System.out.println("Uloziste "+this.nazev+" bylo spusteno");
        pocetSpusteni++;
    }

    @Override
    public void zastavSluzbu() {
        System.out.println("Uloziste "+this.nazev+" bylo zastaveno");
    }

    @Override
    public double vypocitejNaklady(int pocetGB) {
        if (pocetSpusteni > 100){
            return pocetGB*cenaZaGB*2;
        }else if(pocetSpusteni < 5){
            return pocetGB*cenaZaGB-10;
        }else{
            return pocetGB*cenaZaGB;
        }
    }

    public String getNazev() {
        return nazev;
    }

    public double getCenaZaGB() {
        return cenaZaGB;
    }

    public int getPocetSpusteni() {
        return pocetSpusteni;
    }

    @Override
    public String toString() {
        return "Nazev: "+this.nazev+" Cena za GB: "+this.cenaZaGB+" Pocet Spusteni: "+this.pocetSpusteni;
    }
}
