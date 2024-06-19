package OtomasyonJavaFonks;

public class Araba {
    private String model;

    //arabafiyat static bir değişkendir. Nesneye değil sınıfa aittir.
    public static  int arabaFiyat = 5000;

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
}
