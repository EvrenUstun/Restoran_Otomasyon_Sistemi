import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Factory Method Pattern
        System.out.print("Sipariş türünü girin (yemek/içecek): ");
        String siparisTur = scanner.nextLine();

        // Sipariş üreticisi nesnesi oluşturuluyor
        SiparisUreticisi siparisUreticisi = new SiparisUreticisi();

        // Doğru ürünü oluşturmak için sipariş üreticisini kullanıyoruz
        Urun urun = siparisUreticisi.siparisOlustur(siparisTur);

        if (urun != null) {
            urun.hazirla();
        } else {
            System.out.println("Geçersiz sipariş türü!");
        }
        System.out.println("\n-----------------------------\n");
        // Singleton
        // Sipariş İşleme Yöneticisi örneği alınıyor
        SiparisIslemeYoneticisi siparisIslemeYoneticisi = SiparisIslemeYoneticisi.getInstance();

        // Siparişler oluşturuluyor
        Siparis siparis1 = new Siparis("Yemek 1");
        Siparis siparis2 = new Siparis("Yemek 2");
        Siparis siparis3 = new Siparis("İçecek 1");

        // Siparişler alınıyor ve işleniyor
        siparisIslemeYoneticisi.siparisAl(siparis1);
        siparisIslemeYoneticisi.siparisAl(siparis2);
        siparisIslemeYoneticisi.siparisAl(siparis3);

        siparisIslemeYoneticisi.siparisleriIsle();

        System.out.println("\n-----------------------------\n");

        // Decorator
        // Temel yemek oluşturuluyor
        Food temelYemek = new TemelYemek();

        // Peynir ve salam ekstra malzemeleri ekleniyor
        Food yemek1 = new Peynir(temelYemek);
        Food yemek2 = new Salam(new Peynir(temelYemek));

        // Yemeklerin açıklama ve fiyatları görüntüleniyor
        System.out.println(yemek1.getAciklama() + ", Fiyat: " + yemek1.getFiyat());
        System.out.println(yemek2.getAciklama() + ", Fiyat: " + yemek2.getFiyat());

        System.out.println("\n-----------------------------\n");
        // Builder
        // Yemek Builder kullanarak özelleştirilmiş yemek oluşturuluyor
        Yemek yemek = new YemekBuilder("Pizza")
                .baharatli(true)
                .soganli(false)
                .ekstraSoslu(true)
                .build();

        // Özelleştirilmiş yemek görüntüleniyor
        System.out.println(yemek);

        System.out.println("\n-----------------------------\n");
        // prototype
        // Yemekler prototipinden yeni yemekler oluşturuluyor
        CloneableYemek yemek3 = YemekFabrikasi.getYemek("Pizza");
        CloneableYemek yemek4 = YemekFabrikasi.getYemek("Burger");

        // Yemekler hazırlanıyor
        yemek3.hazirla();
        yemek4.hazirla();

        System.out.println("\n-----------------------------\n");
        // Mediator
        SiparisIletisimcisi siparisIletisimcisi = new SiparisIletisimcisi();
        Mutfak mutfak = new Mutfak(siparisIletisimcisi);
        Garson garson = new Garson(siparisIletisimcisi);

        siparisIletisimcisi.setMutfak(mutfak);
        siparisIletisimcisi.setGarson(garson);

        Siparis siparis = new Siparis("Pasta", 5);
        siparisIletisimcisi.siparisVer(siparis);


        System.out.println("\n-----------------------------\n");
        // Chain of Responsibility
        SiparisZinciri siparisZinciri = new SiparisZinciri();

        Siparis siparis4 = new Siparis("Pizza", 2);
        siparisZinciri.siparisAl(siparis4);

        Siparis siparis5 = new Siparis("Çay", 4);
        siparisZinciri.siparisAl(siparis5);

        Siparis siparis6 = new Siparis("Salata", 6);
        siparisZinciri.siparisAl(siparis6);

        System.out.println("\n-----------------------------\n");
        // Observer
        MutfakDepartmani mutfakDepartmani = new MutfakDepartmani();
        GarsonDepartmani garsonDepartmani = new GarsonDepartmani();

        DepartmanGozlemcisi siparisGozlemcisi = new SiparisGozlemcisi("Sipariş Gözlemcisi");

        mutfakDepartmani.addObserver(siparisGozlemcisi);

        mutfakDepartmani.setSonrakiDepartman(garsonDepartmani);

        Siparis siparis7 = new Siparis("Pizza", 2);
        mutfakDepartmani.siparisiIsle(siparis7);

        Siparis siparis8 = new Siparis("Çay", 4);
        mutfakDepartmani.siparisiIsle(siparis8);
    }
}

