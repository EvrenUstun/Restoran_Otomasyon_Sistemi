public class Yemek implements Urun {



    private String tur;
    private boolean baharatli;
    private boolean soganli;
    private boolean ekstraSoslu;

    public Yemek(YemekBuilder builder) {
        this.tur = builder.tur;
        this.baharatli = builder.baharatli;
        this.soganli = builder.soganli;
        this.ekstraSoslu = builder.ekstraSoslu;
    }

    public Yemek() { }

    public String getTur() {
        return tur;
    }

    public boolean isBaharatli() {
        return baharatli;
    }

    public boolean isSoganli() {
        return soganli;
    }

    public boolean isEkstraSoslu() {
        return ekstraSoslu;
    }

    @Override
    public String toString() {
        return "Yemek{" +
                "tur='" + tur + '\'' +
                ", baharatli=" + baharatli +
                ", soganli=" + soganli +
                ", ekstraSoslu=" + ekstraSoslu +
                '}';
    }

    @Override
    public void hazirla() {
        System.out.println("Yemek hazırlanıyor...");
    }
}