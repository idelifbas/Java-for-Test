public class LoopsProje {
    //"Hello World!" yazimiz mevcut
    // Bu yazi içindeki o oları O ile değiştir.

public static void main(String[] args) {

    //1. Yontem replace metodu
    String yazi = "Hello World!";

    String yeniyazi = yazi.replace("o", "O");

    System.out.println(yazi);
    System.out.println(yeniyazi);



    //2.yontem charArt, karakterleri tek tek atama

    int stringUzunlugu = yazi.length();
    char bulunanKarakter = yazi.charAt(0);
    String yeniString = "";
    System.out.println(bulunanKarakter);

    for(int i = 0; i < stringUzunlugu; i++){
        bulunanKarakter = yazi.charAt(i);
        if(bulunanKarakter == 'o' ){
            yeniString += "O";
        }
        else{
            yeniString += bulunanKarakter;
        }
    }
    System.out.println(yeniString);






    }
}
