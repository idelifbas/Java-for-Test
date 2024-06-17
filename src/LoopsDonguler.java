public class LoopsDonguler {
    public static void main(String[] args)
    {
        //FOR DONGUSU:

        for (double i = 0; i < 2; i += 0.25){
           System.out.println("Değişiken değeri: " + i);
        }


        int sayfa = 5;
        for(int s=1; s <= sayfa; s++){
            System.out.println("Sayfa sayisi " + s);
            if(s == 3) {
                System.out.println("Döngüden çık");
                break;
            }
        }


        String [] isimler = {"elif","ebru","ergül","yağmur"};

        for (int a=0; a < isimler.length; a++){
            System.out.println("Listedeki isimler " + isimler[a]);

        }

        //ENHANCED (Gelişmiş) for Loop

        for (String isim: isimler){

            System.out.println("Gelişmiş dongu ile isimler " + isim);

        }


        //WHILE DONGUSU

        int j = 1;

        while(true){
            if(j > 5)
                break;

            System.out.println("While loop ile sayımız: " + j);
            j++;
        }

        j = 1;
        do{
            if (j > 5)
                break;
            System.out.println("Do While loop ile sayımız: " + j);
            j++;
        }while(true);




    }

}


