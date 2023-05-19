public class Mutfak implements Department {
    private SiparisIletisimcisi siparisIletisimcisi;

    public Mutfak(SiparisIletisimcisi siparisIletisimcisi) {
        this.siparisIletisimcisi = siparisIletisimcisi;
    }

    public void siparisAl(Siparis siparis) {
        System.out.println("Mutfak: " + siparis.getAd() + " siparişini aldı.");
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

    public void yemekHazirla(Siparis siparis) {
        System.out.println("Mutfak: " + siparis.getAd() + " yemeği hazırlandı.");
        siparisIletisimcisi.yemekHazirlandi(this, siparis);
    }
}
