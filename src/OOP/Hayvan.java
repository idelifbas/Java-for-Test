package OOP;
//superclass
abstract class Hayvan {
//Abstraction, uygulamanın karmaşıklıklarını gizler ve daha basit arayüzleri ortaya çıkarır
//Abstract sınıflar nesne oluşturmak için kullanılmazlar
//Abstract sınıfa erişmek için sınıfların abstract sınıfa katılım  veya kalıtım (inheritance etmesi gerekir.
// Abstacrt methodlarda oluşturabiliriz. bu methodlar normal methodlardan farklı bir biçimde body kısmını içermezler
    //ve sadece abstract sınıf içerisinde kullanılabilriler

    abstract void sesCikar(); //bu method alt sınıflarda mutlaka implement edilmeli

    public void uyku(){
        System.out.println("Hayvan uyuyor.");
    }
}
