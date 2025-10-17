public class CloudCompute implements ICloudService{
    private String nazev;
    private double cenaZaHodinu;

    public CloudCompute(String nazev, double cenaZaHodinu) {
        this.nazev = nazev;
        this.cenaZaHodinu = cenaZaHodinu;
    }

    @Override
    public void spustSluzbu() {
        System.out.println("Vypocetni sluzba "+this.nazev+" byla spustena");
    }

    @Override
    public void zastavSluzbu() {
        System.out.println("Vypocetni sluzba "+this.nazev+" byla zastavena");
    }

    @Override
    public double vypocitejNaklady(int hodiny) {

        return cenaZaHodinu*hodiny;
    }
    @Override
    public String getNazev() {
        return nazev;
    }

    @Override
    public String toString() {
        return "Nazev sluzby: "+this.nazev+" Cena za hodinu: "+this.cenaZaHodinu;
    }

}
