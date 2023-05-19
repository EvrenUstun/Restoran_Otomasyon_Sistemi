public class Garson implements Department {
    private SiparisIletisimcisi siparisIletisimcisi;

    public Garson(SiparisIletisimcisi siparisIletisimcisi) {
        this.siparisIletisimcisi = siparisIletisimcisi;
    }

    public void siparisAl(Siparis siparis) {
        System.out.println("Garson: " + siparis.getAd() + " siparişini aldı.");
        siparisIletisimcisi.siparisIslemiTamamlandi(this, siparis);
    }

    @Override
    public void siparisiIsle(Siparis siparis) {

    }

    @Override
    public void setSonrakiDepartman(Department sonrakiDepartman) {

    }

    @Override
    public void addObserver(DepartmanGozlemcisi gozlemci) {

    }

    @Override
    public void removeObserver(DepartmanGozlemcisi gozlemci) {

    }

    @Override
    public void notifyObservers(Siparis siparis) {

    }

    public void yemekServisEt(Siparis siparis) {
        System.out.println("Garson: " + siparis.getAd() + " yemeği servis etti.");
        siparisIletisimcisi.yemekServisEdildi(this, siparis);
    }
}
