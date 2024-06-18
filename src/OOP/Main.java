package OOP;

public class Main {
    public static void main(String[] args){

//        Insan ben = new Insan(); //insan sınıfını kullanarak insan nesnesi oluşturduk.

//        ben.konsolaYazdir();

        Lamba salonLambasi = new Lamba("salon");
        salonLambasi.LambaDurumu(); //kapalı
        salonLambasi.durum = true;
        salonLambasi.LambaDurumu(); //açık

        Lamba mutfakLambasi = new Lamba("mutfak");
        mutfakLambasi.LambaDurumu(); //kapalı


    }
}
