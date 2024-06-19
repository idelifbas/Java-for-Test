package OtomasyonJavaFonks;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args){
        //listemizi tanımladık
        ArrayList<String> isimlerinListesi = new ArrayList<>();

        //listeye ekleme
        isimlerinListesi.add("Elif");
        isimlerinListesi.add("Ebru");
        System.out.println(isimlerinListesi);

        isimlerinListesi.add("Yiğit");
        isimlerinListesi.add("Yağmur");
        System.out.println(isimlerinListesi);

        //Listenin indexine göre elemanları yazdırma
        System.out.println(isimlerinListesi.get(0));

        //Listenin indexindeki elemanı güncelleme
        isimlerinListesi.set(1,"Hazal");
        System.out.println(isimlerinListesi);

        //listeden eleman silme/kaldırma
        String silinenIsim = isimlerinListesi.remove(0);
        System.out.println(isimlerinListesi);
        System.out.println(silinenIsim + " ismi listeden silinmiştir.");

        //Listenin boyutunu öğrenme
        System.out.println(isimlerinListesi.size() + " listemizin boyutu.");

        //listede o eleman bulunuyor mu kontrolü
        System.out.println("listemizde Elif ismi: " +isimlerinListesi.contains("Elif"));
        System.out.println("listemizde Yiğit ismi: " +isimlerinListesi.contains("Yiğit"));

        //Listedeki bir verinin index numarasını öğrenme
        System.out.println("İsmin Liste numarası Yağmur: " + isimlerinListesi.indexOf("Yağmur"));

        //Liste boş mu dolu mu öğrenme
        System.out.println(isimlerinListesi.isEmpty());

        //listedki verileri tek tek döngü ile yazdırma
        for(String isim:isimlerinListesi){
            System.out.println(isim);
        }
    }
}
