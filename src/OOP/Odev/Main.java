package OOP.Odev;
//3 adet sınıf oluştur. Araba, Sedan, Hatchback
//3 sınıf arasındaki ilişkiyi tanımla
//kasaTipi, model, kullanımKm, fiyat ve kapi değişkenlerini tanımla
//arabayiSur methodu oluştur. Bu method ile; arabanın km si verilen değerle arttırlsın ve konsola bir yazı yazılsın
//tüm sınıflarda constructor olmalı vee değişkenlerin tamammı ya da bir kısmı constructorlarda tanımlanmalı
//satisFiyatı adında bir method oluşturularak arabanın satış fiyatını belirleyin
//Ana sınıfta 2 farklı araç oluşturarak, bu araçları sürüğ fiyatlarını güncelleyin.

public class Main {
    public static  void main (String[] args){

        Sedan sedanCoupe = new Sedan("Opel", 10000, 500000.00,5);
        System.out.println("Aracin modeli: "+ sedanCoupe.getModel() + " kullanim km: "+ sedanCoupe.getKullanimKm() + " fiyati: "+ sedanCoupe.getFiyat()
        + " kapı sayısı: " + sedanCoupe.getKapi());

        sedanCoupe.arabayiSur(5000);
        sedanCoupe.satisFiyat(495000.00);
        System.out.println("Aracin modeli: "+ sedanCoupe.getModel() + " kullanim km: "+ sedanCoupe.getKullanimKm() + " fiyati: "+ sedanCoupe.getFiyat()
                + " kapı sayısı: " + sedanCoupe.getKapi());

        sedanCoupe.arabayiSur(5000);
        sedanCoupe.satisFiyat(450000.00);
        System.out.println("Aracin modeli: "+ sedanCoupe.getModel() + " kullanim km: "+ sedanCoupe.getKullanimKm() + " fiyati: "+ sedanCoupe.getFiyat()
                + " kapı sayısı: " + sedanCoupe.getKapi());

        System.out.println("-----------Hatcback------------");

        Hatchback hatchbackVolvo = new Hatchback("Volvo",0, 1500000.00,5);
        hatchbackVolvo.arabayiSur(1000);
        hatchbackVolvo.satisFiyat(950000);
        System.out.println("Aracin modeli: " + hatchbackVolvo.getModel() + " kullanım km: "+ hatchbackVolvo.getKullanimKm() +
                " fiyati: " + hatchbackVolvo.getFiyat() + " kapi: " +hatchbackVolvo.getKapi());

        hatchbackVolvo.arabayiSur(2000);
        hatchbackVolvo.satisFiyat(900000);

        System.out.println("Aracin modeli: " + hatchbackVolvo.getModel() + " kullanım km: "+ hatchbackVolvo.getKullanimKm() +
                " fiyati: " + hatchbackVolvo.getFiyat() + " kapi: " +hatchbackVolvo.getKapi());






    }
}
