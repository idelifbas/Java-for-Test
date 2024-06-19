package OtomasyonJavaFonks;

public class Main {
    public static void main(String[] args){

        //arabaFiyat static bir değişkendi direk sınıf üzerinden erişebiliriz normalde nesne üzerinden erişiyorduk.
        //ilkArabam.arabaFiyat yerine direk Araba.arabaFiyat yazabiliriz.

        Araba ilkArabam = new Araba();
        ilkArabam.setModel("Volvo");
        System.out.println("İlk arabamin modeli: "+ ilkArabam.getModel()
        + " fiyati: " + Araba.arabaFiyat);

        Araba ikinciAraba = new Araba();
        Araba.arabaFiyat = 90000; //static değişkeni değişitrilebildik
        ikinciAraba.setModel("BMW");
        System.out.println("İlk arabamin modeli: "+ ikinciAraba.getModel()
                + " fiyati: " + Araba.arabaFiyat);


        Araba ucuncuAraba = new Araba();
        ucuncuAraba.setModel("Opel");
        System.out.println("İlk arabamin modeli: "+ ikinciAraba.getModel()
                + " fiyati: " + Araba.arabaFiyat);

    }
}
