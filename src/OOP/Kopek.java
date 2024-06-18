package OOP;
//subclass
public class Kopek extends Hayvan {
    //Encapculation
    private String isim;
    private String cins;
    private int yas;


    public Kopek(String isim, String cins, int yas) {
        //bu bir constructordır.

        this.isim = isim;
        //this kullanarak ilk kullnıdğımız değişkenin sınıfa ait 2. sinin constructordaki değişken olduğunu belirtiyoruz.
        this.cins = cins;
        this.yas = yas;

    }
    // otomatik getter oluşturduk. yorum satırı manuel
    public String getIsim() {
        return isim;
    }

    public String getCins() {
        return cins;
    }

    public int getYas() {
        return yas;
    }
    //güncelleme yetkisi verdik
    public String setIsim(String yeniIsim) {
        return  this.isim = yeniIsim;
    }

    @Override
    void sesCikar() {
        System.out.println("hav hav");
    }
    @Override //aynı isimde üst sınıfta tanımlı methodu var o yüzden overrride yazıyoruz.
    public void uyku(){
        System.out.println("Kopek horluyor..");
    }
}
    //  method yazıyoruz
    //  public String getIsim(){
    //     return this.isim;
    // herhangi bir sınıftan bu method ile isim değişkenine ulaşabilirsiz.


    //  public String getCins(){
    //      return this.cins;
    //    }
    //  public int getYas(){
    //     return this.yas;
    //
    //   }


