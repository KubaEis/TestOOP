public class Main {
    public static void main(String[] args) {
        CloudManager manager = new CloudManager();
        CloudCompute compute1 = new CloudCompute("compute1", 10);
        CloudCompute compute2 = new CloudCompute("compute2", 20);
        CloudStorage storage1 = new CloudStorage("storage1", 30);
        CloudStorage storage2 = new CloudStorage("storage2", 40);

        manager.pridejSluzbu(compute1);
        manager.pridejSluzbu(compute2);
        manager.pridejSluzbu(storage1);
        manager.pridejSluzbu(storage2);

        /*System.out.println("Testovani Compute 1:");
        compute1.spustSluzbu();
        compute1.zastavSluzbu();
        System.out.println("Naklady za pocet hodin"+compute1.vypocitejNaklady(20));


        System.out.println("Testovani Compute 2:");
        compute2.spustSluzbu();
        compute2.zastavSluzbu();
        System.out.println("Naklady za pocet hodin"+compute2.vypocitejNaklady(30));

        System.out.println("Testovani Storage 1:");
        storage1.spustSluzbu();
        storage1.zastavSluzbu();
        System.out.println("Naklady za pocet hodin"+storage1.vypocitejNaklady(10));

        System.out.println("Testovani Storage 2:");
        storage2.spustSluzbu();
        storage2.zastavSluzbu();
        System.out.println("Naklady za pocet hodin"+storage2.vypocitejNaklady(40));*/

        System.out.println("\nSpusteni vsech sluzeb:\n");
        manager.spustVsechnySluzby();
        System.out.println("\nZastaveni vsech sluzeb:\n");
        manager.zastavVsechnySluzby();
        System.out.println("\nVypocteni nakladu vsech sluzeb:\n");
        manager.vypisNaklady(10);
        System.out.println("\nVypis informaci o vsech sluzbach:\n");
        manager.vypisInformace();






    }
}