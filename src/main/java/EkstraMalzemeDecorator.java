abstract class EkstraMalzemeDecorator implements Food {
    protected Food yemek;

    public EkstraMalzemeDecorator(Food yemek) {
        this.yemek = yemek;
    }

    public abstract String getAciklama();
    public abstract double getFiyat();
}