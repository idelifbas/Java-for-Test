public class VeriTipleriOdev {
    public static void main(String[] args)
    {
        // 3 adet değer içeren bir array oluşturun. Değerler Java, Python, C
        // 1'den 5 e kadar seviye içeren bir array oluşturun
        // bu verileri kullanarak konsola Java, Python ve C yazılım dillerindeki seviyenizi yazdırın.

        String[] progamDili= {"Java","Python","C"};
        int[] seviye={1,2,3,4,5};

        System.out.println("Dil:" + progamDili[0] +"  Seviye:" + seviye[2]);
        System.out.println("Dil:" + progamDili[1] +"  Seviye:" + seviye[3]);
        System.out.println("Dil:" + progamDili[2] +"  Seviye:" + seviye[4]);
    }
}
