public class Operatorler {
    public static void main(String[] args)
    {
        int a = 40;
        int b = 20;

        double c = 55.22;

        //Aritmatik operatöler
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println(a+c);

        System.out.println(++a); //41
        System.out.println(a++); //41
        System.out.println(a); //42

        System.out.println(--b); //19
        System.out.println(b--); //19
        System.out.println(b); //18

        //Atama operatörleri

        int d = 50;
        d+=3;
        System.out.println(d); //53

        d-=2;
        System.out.println(d); //51

        //Karşılaştırma operatörü
        // == , != , <, >, >=, <=
        int e = 30;
        int f = 40;

        System.out.println(e == f); //false
        System.out.println(e != f); //true
        System.out.println(e > f); //false
        System.out.println(e < f); //true
        System.out.println(e >= f); //false
        System.out.println(e <= f); //true

        if(e != f)
        {
            System.out.println("koşul sağlandı");
        }

        //Mantıksal Operatorler

        if(e > 40 || f < 50)
            System.out.println("koşul sağlandı 2 ");

        if (e > 40 && f < 50)
            System.out.println("koşul sağlandı 3 "); //sağlanmadı ve yazmadı



    }
}
