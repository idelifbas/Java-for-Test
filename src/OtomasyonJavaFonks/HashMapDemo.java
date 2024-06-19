package OtomasyonJavaFonks;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        //hashmap tanımlama
        HashMap <String, Integer > ogrenciNotu = new HashMap<>();

        //listeye veri ekleme
        ogrenciNotu.put("Elif",100);
        ogrenciNotu.put("Ebru",60);
        ogrenciNotu.put("Yiğit",75);

        System.out.println(ogrenciNotu);
        System.out.println("Elifin notu: "+ ogrenciNotu.get("Elif"));


        //sadece anahtar değerler(parametre)
        System.out.println("Butun anahtar değerler: " + ogrenciNotu.keySet());

        //anahtar değerlerin değerleri ( parametrelerin değerleri
        System.out.println("Butun değerler " + ogrenciNotu.values());

        //Çıktısı: Butun girdi çiftleri: [Ebru=60, Yiğit=75, Elif=100]
        System.out.println("Butun girdi çiftleri: " + ogrenciNotu.entrySet());

        //Elif parametresinin değerini güncelledik
        ogrenciNotu.replace("Elif",80);
        System.out.println(ogrenciNotu);

        //Elif parametresini listeden kaldırdık.
        ogrenciNotu.remove("Elif");
        System.out.println(ogrenciNotu);








    }
}
