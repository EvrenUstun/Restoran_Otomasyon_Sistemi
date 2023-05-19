public class SiparisZinciri {
    private Department baslangicDepartmani;

    public SiparisZinciri() {
        olusturZincir();
    }

    private void olusturZincir() {
        baslangicDepartmani = new MutfakDepartmani();
        Department garsonDepartmani = new GarsonDepartmani();
        Department odemeDepartmani = new OdemeDepartmani();

        baslangicDepartmani.setSonrakiDepartman(garsonDepartmani);
        garsonDepartmani.setSonrakiDepartman(odemeDepartmani);
    }

    public void siparisAl(Siparis siparis) {
        baslangicDepartmani.siparisiIsle(siparis);
    }
}
