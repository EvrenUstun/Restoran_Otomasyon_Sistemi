import java.util.ArrayList;
import java.util.List;

// Sipariş İşleme Yöneticisi Singleton sınıfı
public class SiparisIslemeYoneticisi {
    private static SiparisIslemeYoneticisi instance;
    private List<Siparis> siparisListesi;

    private SiparisIslemeYoneticisi() {
        siparisListesi = new ArrayList<>();
    }

    public static synchronized SiparisIslemeYoneticisi getInstance() {
        if (instance == null) {
            instance = new SiparisIslemeYoneticisi();
        }
        return instance;
    }

    public void siparisAl(Siparis siparis) {
        siparisListesi.add(siparis);
        System.out.println("Sipariş alındı: " + siparis.getUrunAdi());
    }

    public void siparisleriIsle() {
        System.out.println("Siparişler işleniyor...");
        for (Siparis siparis : siparisListesi) {
            System.out.println("Sipariş hazırlanıyor: " + siparis.getUrunAdi());
        }
        siparisListesi.clear();
        System.out.println("Tüm siparişler işlendi.");
    }
}