package OOP;

public class Lamba { //sınıf

    public boolean durum = false;
    private String konum;

    //constructor geri dönüş tipi belirtilmesine gerek yok
    //constructor sınıf ismi ile aynı olmalı
    //constructorlar değişkenlerden sonra methodlardan önce yazılır

    public Lamba(String odaKonumu){
        konum = odaKonumu;
        System.out.println("Odamızın konumu: " + konum);
    }

    public void LambaDurumu(){ //Method
        if(durum){
            System.out.println("Lamba Açık");
        }else {
            System.out.println("Lamba Kapalı");
        }
    }
}
