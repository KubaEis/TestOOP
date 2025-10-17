import java.util.ArrayList;
import java.util.List;

public class CloudManager {
    List<ICloudService> cloudServices = new ArrayList<ICloudService>();

    public CloudManager() {}

    public void pridejSluzbu(ICloudService sluzba) {
        cloudServices.add(sluzba);
    }

    public void spustVsechnySluzby(){
        for (int i = 0; i < cloudServices.size(); i++) {
            cloudServices.get(i).spustSluzbu();

        }
    }

    public void zastavVsechnySluzby(){
        for (int i = 0; i < cloudServices.size(); i++) {
            cloudServices.get(i).zastavSluzbu();
        }
    }

    public void vypisNaklady(int hodiny){
        for (int i = 0; i < cloudServices.size(); i++) {
            System.out.println("Nazev sluzby: "+cloudServices.get(i).getNazev()+" Naklady: "+cloudServices.get(i).vypocitejNaklady(hodiny));
        }
    }

    public void vypisInformace(){
        for (int i = 0; i < cloudServices.size(); i++) {
            System.out.println(cloudServices.get(i).toString());
        }
    }
}
