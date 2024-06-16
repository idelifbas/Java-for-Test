import java.util.Locale;
//non-primitive ilkel olmayan değişkenler
//string bir karakter dizisidir.
public class ilkString {
    public static void main(String[] args) {
        String ilkMetin = "Test Otomasyonu";
        String ikinciMetin = "Yazılım Testi";

        System.out.println(ilkMetin);
        System.out.println(ikinciMetin);


        int metinuzunlugu= ikinciMetin.length();
        System.out.println(metinuzunlugu);

        String kucukHarf =ilkMetin.toLowerCase();
        System.out.println(kucukHarf);

        String buyukHarf =ikinciMetin.toUpperCase();
        System.out.println(buyukHarf);

        System.out.println(kucukHarf +" "+ buyukHarf);

        String yeniString = "En sevdiğim  \"film\" conherence\nelif";

        System.out.println(yeniString);


    }
}

