public class YemekBuilder {
    public String tur;
    public boolean baharatli;
    public boolean soganli;
    public boolean ekstraSoslu;

    public YemekBuilder(String tur) {
        this.tur = tur;
    }

    public YemekBuilder baharatli(boolean baharatli) {
        this.baharatli = baharatli;
        return this;
    }

    public YemekBuilder soganli(boolean soganli) {
        this.soganli = soganli;
        return this;
    }

    public YemekBuilder ekstraSoslu(boolean ekstraSoslu) {
        this.ekstraSoslu = ekstraSoslu;
        return this;
    }

    public Yemek build() {
        return new Yemek(this);
    }
}
