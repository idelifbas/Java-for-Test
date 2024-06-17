public class IfElseKosul {
    public static void main(String[] args){

        int saat = 1200;

        if (saat < 1200)
            System.out.println("Saat öğleden önce");
        else
            System.out.println("Saat öğleden sonra");


        if (saat < 1200)
            System.out.println("Saat öğleden önce");
        else if(saat > 1200)
            System.out.println("Saat öğleden sonra");
        else
            System.out.println("Saat öğlen"); //yazıldı.

        saat = 1130;
        boolean isTrue = saat < 1200;
        if (isTrue)
            System.out.println("Saat öğleden önce"); //yazıldı.
        else if(saat > 1200)
            System.out.println("Saat öğleden sonra");
        else
            System.out.println("Saat öğlen");


    }
}
