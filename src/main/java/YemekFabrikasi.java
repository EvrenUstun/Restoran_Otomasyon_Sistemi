import java.util.HashMap;
import java.util.Map;

public class YemekFabrikasi {
    private static Map<String, CloneableYemek> yemekler = new HashMap<>();

    static {
        // Yemek prototipleri oluşturuluyor
        CloneableYemek yemek1 = new YemekPrototipi("Pizza");
        CloneableYemek yemek2 = new YemekPrototipi("Burger");

        // Yemek prototipleri kaydediliyor
        yemekler.put("Pizza", yemek1);
        yemekler.put("Burger", yemek2);
    }

    public static CloneableYemek getYemek(String tur) {
        CloneableYemek yemek = yemekler.get(tur);
        return (CloneableYemek) yemek.klonla();
    }
}
