// Salam ekstra malzeme sınıfı
public class Salam extends EkstraMalzemeDecorator {
    public Salam(Food yemek) {
        super(yemek);
    }

    @Override
    public String getAciklama() {
        return yemek.getAciklama() + ", Salam";
    }

    @Override
    public double getFiyat() {
        return yemek.getFiyat() + 1.5;
    }
}