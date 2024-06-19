package OtomasyonJavaFonks;

import java.util.ArrayList;
import java.util.HashMap;

/*
-öğrencilerden Adını, Soyadını, Dersini, ve notunu tutan bir harita oluşturmak istiyoruz.
sonrasında öürencilerden bir liste oluşturulamı
Öğrenci 1 : ismi: John, Soyadı: Doe, Ders: matematik, Not:90
Öğrenci 2 : ismi: Kate, Soyadı: Win, Ders: fizik, Not:100
Öğrenci 1 : ismi: Juan, Soyadı: Jose, Ders: spor, Not:50
 */
public class ListOfMaps {
    public static void main (String[] args){
        HashMap<String,String> ilkOgrenci = new HashMap<>();

        ilkOgrenci.put("İsim","John");
        ilkOgrenci.put("Soyisim","Doe");
        ilkOgrenci.put("Ders","Matemetik");
        ilkOgrenci.put("Not","90");

        System.out.println(ilkOgrenci);

        HashMap<String,String> ikinciOgrenci = new HashMap<>();
        ikinciOgrenci.put("İsim","Kate");
        ikinciOgrenci.put("Soyisim","Win");
        ikinciOgrenci.put("Ders","Fizik");
        ikinciOgrenci.put("Not","100");

        System.out.println(ikinciOgrenci);

        HashMap<String,String> ucuncuOgrenci = new HashMap<>();
        ucuncuOgrenci.put("İsim","Juan");
        ucuncuOgrenci.put("Soyisim","Jose");
        ucuncuOgrenci.put("Ders","Beden");
        ucuncuOgrenci.put("Not","50");

        System.out.println(ucuncuOgrenci);


        ArrayList<HashMap<String, String>> ogrenciListesi = new ArrayList<>();

        ogrenciListesi.add(ilkOgrenci);
        ogrenciListesi.add(ikinciOgrenci);
        ogrenciListesi.add(ucuncuOgrenci);

        System.out.println("*********");
        System.out.println(ogrenciListesi);
        System.out.println(ogrenciListesi.get(0));

    }
}
