public class YemekPrototipi implements CloneableYemek {
    private String ad;

    public YemekPrototipi(String ad) {
        this.ad = ad;
    }

    public void hazirla() {
        System.out.println(ad + " hazırlanıyor...");
    }

    public CloneableYemek klonla() {
        try {
            return (CloneableYemek) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
