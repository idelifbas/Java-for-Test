public class OperatorlerODev {
    //iki adet integer 85 ve 45
    //konsola değişkenleri kullanarak iki ayrı satirda sayiların toplamını ve çarpımını yazdırın
    //Örnek: 'sayıların toplamı 130 dur'
    //Eğer sayıların çarpımı 3000 den büyük ve 4000 den küçükse konsola sayıların çarpım değerini yazınız.

    public static void main(String[] args){

        int a = 45;
        int b = 85;

        System.out.println("Sayıların toplamı: " + (a+b) );
        System.out.println("Sayıların çarpımı: " + a*b );

        int carp=a*b;

        if(carp > 3000 && carp < 4000)
            System.out.println(carp);





    }

}
