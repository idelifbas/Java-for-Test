public class JavaMethodları {
    public static void main(String[] args){

        konsolaYazdir(); //methodumuzu çağırdık
        yasadigimSehir("İstanbul");
        toplama(5 , 3);
        sinav("Elif",80);

        System.out.println("Voidsiz: " + carpma( + 8,7));


        System.out.println("toplama2: " + toplama( + 8,7,16));
        System.out.println("toplama3: " + toplama( + 8.1,7.7,9.8));

    }

    private static void konsolaYazdir(){
        System.out.println("Merhaba Dünya!");
    }
    private static void yasadigimSehir(String sehir){
        System.out.println(sehir);
    }
    // Method Overloading: Aynı isimle birden fazla farklı parametre içeren method oluşturması
    private static void toplama(int a, int b){
        System.out.println(a + b);
    }
    private static int toplama(int a, int b, int c){
        return a+b+c;
    }
    private static double toplama(double a, double b, double c){
        return a+b+c;
    }
    //konsola kişinin adını ve sinav notunu yazdiran bir methıd oluşturun
    //method 2 adet parametre alsın ad ve sinav notu

    private static void sinav(String ad, int not){
        System.out.println(ad + " " + not);
    }

    private static int carpma(int a, int b){
        int sonuc = a*b;
        return sonuc;
    }


}
