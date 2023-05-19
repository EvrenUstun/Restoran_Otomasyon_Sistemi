public class SiparisGozlemcisi implements DepartmanGozlemcisi {
    private String ad;

    public SiparisGozlemcisi(String ad) {
        this.ad = ad;
    }

    public void update(Siparis siparis) {
        System.out.println(ad + ": " + siparis.getAd() + " siparişi hazır, diğer departmanlara iletiliyor.");
    }
}
