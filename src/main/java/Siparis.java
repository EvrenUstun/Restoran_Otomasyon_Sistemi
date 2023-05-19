public class Siparis {
    private String urunAdi;
    private String ad;
    private int masaNo;

    public Siparis(String ad, int masaNo) {
        this.ad = ad;
        this.masaNo = masaNo;
    }

    public String getAd() {
        return ad;
    }

    public int getMasaNo() {
        return masaNo;
    }

    public Siparis() {}

    public Siparis(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }
}