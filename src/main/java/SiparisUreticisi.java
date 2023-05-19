public class SiparisUreticisi {
    // Sipariş türüne göre doğru ürünü oluşturan fabrika metodu
    public Urun siparisOlustur(String tur) {
        if (tur.equalsIgnoreCase("yemek")) {
            return new Yemek();
        } else if (tur.equalsIgnoreCase("içecek")) {
            return new Icecek();
        }
        return null;
    }
}