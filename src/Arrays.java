//ARRAY, aynı tipten çok sayıda değişken tanımlamak için kullanılır.
//Array bir sınıftır.(non-primitive variable)

public class Arrays {
    public static void main (String[] args){

        String[] isimler = {"elif","ebru","ergül","hüseyin"};

        int[] sayilar = {5,4,45,44,33,5055};
        //java da indexler sıfırdan başlar
        System.out.println(isimler[0]);
        System.out.println(isimler[2]);

        //index değer değiştirme
        isimler[3]="yağmur";
        System.out.println(isimler[3]);

        //dizi uzunluğu bulma
        int diziUzunlugu = isimler.length;
        System.out.println(diziUzunlugu);

        for(int i=0;i<isimler.length;i++){
            System.out.println(isimler[i]);

        }




    }
}
