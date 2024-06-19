package OOP.Odev;

public class Araba {
    private String kasaTipi;
    private String model;
    private int kullanimKm;
    private double fiyat;
    private int kapi;




    //constructor
    public Araba(String kasaTipi, String model,int kullanimKm, double fiyat, int kapi){
        this.kasaTipi = kasaTipi;
        this.model = model;
        this.kullanimKm = kullanimKm;
        this.fiyat = fiyat;
        this.kapi = kapi;

    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public int getKullanimKm() {
        return kullanimKm;
    }

    public double getFiyat() {
        return fiyat;
    }

    public int getKapi() {
        return kapi;
    }


    //method
    public void arabayiSur(int surulenKm){
        this.kullanimKm += surulenKm;
        System.out.println("Arabanın yeni km si: "+ this.kullanimKm);
    }
    public double satisFiyat(double yeniSatisFiyati){
        return this.fiyat = yeniSatisFiyati;
    }
}
