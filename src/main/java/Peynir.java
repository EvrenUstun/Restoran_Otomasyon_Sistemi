public class Peynir extends EkstraMalzemeDecorator {
    public Peynir(Food yemek) {
        super(yemek);
    }

    @Override
    public String getAciklama() {
        return yemek.getAciklama() + ", Peynir";
    }

    @Override
    public double getFiyat() {
        return yemek.getFiyat() + 2.0;
    }
}