import java.util.ArrayList;
import java.util.List;

public class SiparisIletisimcisi {
    private Mutfak mutfak;
    private Garson garson;
    private List<Siparis> bekleyenSiparisler;

    public SiparisIletisimcisi() {
        bekleyenSiparisler = new ArrayList<>();
    }

    public void setMutfak(Mutfak mutfak) {
        this.mutfak = mutfak;
    }

    public void setGarson(Garson garson) {
        this.garson = garson;
    }

    public void siparisVer(Siparis siparis) {
        bekleyenSiparisler.add(siparis);
        System.out.println("Müşteri: " + siparis.getAd() + " siparişini verdi.");
        garson.siparisAl(siparis);
    }

    public void siparisIslemiTamamlandi(Department departman, Siparis siparis) {
        if (departman instanceof Garson) {
            mutfak.siparisAl(siparis);
        } else if (departman instanceof Mutfak) {
            mutfak.yemekHazirla(siparis);
        }
    }

    public void yemekHazirlandi(Department departman, Siparis siparis) {
        garson.yemekServisEt(siparis);
    }

    public void yemekServisEdildi(Department departman, Siparis siparis) {
        bekleyenSiparisler.remove(siparis);
        System.out.println("Müşteri: " + siparis.getAd() + " siparişi servis edildi.");
    }
}
