public class SwitchCase {
    public static void main(String[] args)
    {
        int sayi = 3;

        switch (sayi)
        {
            case 1:
                System.out.println("Sayi 1 e eşittir.");
                break;

            case 2:
                System.out.println("Sayi 2 e eşittir.");
                break;

            default:
                System.out.println("Sayi 1 veya 2  eşit değildir.");

        }

        String browser = "Chrome";

        switch (browser) {
            case "Chrome":
                System.out.println("Chrome browserini başlat");
                //webdriver.startDriver.startChrome
                break;
            case "Firefox":
                System.out.println("Firefox browserini başlat");
                //webdriver.startDriver.startFirefox
                break;

            default:
                System.out.println("Tanimsiz browser");

        }

        //ödev
        //Haftanın 7 günü vardır
        // Her gun icin "bugün günlerden ... " konsola yazdır.

        String gun = "Salı";

        switch (gun){
            case "Pazartesi":
                System.out.println("Bugün günlerden: " + gun);
                break;
            case "Salı":
                System.out.println("Bugün günlerden: " + gun);
                break;
            case "Çarşamba":
                System.out.println("Bugün günlerden: " + gun);
                break;
            case "Perşembe":
                System.out.println("Bugün günlerden: " + gun);
                break;
            case "Cuma":
                System.out.println("Bugün günlerden: " + gun);
                break;
            case "Cumartesi":
                System.out.println("Bugün günlerden: " + gun);
                break;
            case "Pazar":
                System.out.println("Bugün günlerden: " + gun);
                break;
            default:
                System.out.println("Verilen gun tanımlı değil");

        }

        //java 14 den switch case kullanımı
        switch (gun){
            case "Pazartesi" -> System.out.println("Bugün günlerden: " + gun);
            case "Salı" -> System.out.println("Bugün günlerden: " + gun);
            case "Çarşamba" -> System.out.println("Bugün günlerden: " + gun);
            case "Perşembe" -> System.out.println("Bugün günlerden: " + gun);
            case "Cuma" -> System.out.println("Bugün günlerden: " + gun);
            case "Cumartesi" -> System.out.println("Bugün günlerden: " + gun);
            case "Pazar" -> System.out.println("Bugün günlerden: " + gun);
            default -> System.out.println("Bugün günlerden: " + gun);
        }

    }
}
