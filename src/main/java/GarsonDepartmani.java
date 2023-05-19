public class GarsonDepartmani implements Department {
    private Department sonrakiDepartman;

    @Override
    public void siparisAl(Siparis siparis) {

    }

    public void siparisiIsle(Siparis siparis) {
        if (siparis.getAd().equals("Çay")) {
            System.out.println("Garson Departmanı: " + siparis.getAd() + " siparişini aldı ve servis etti.");
        } else {
            if (sonrakiDepartman != null) {
                sonrakiDepartman.siparisiIsle(siparis);
            }
        }
    }

    public void setSonrakiDepartman(Department sonrakiDepartman) {
        this.sonrakiDepartman = sonrakiDepartman;
    }

    public void addObserver(DepartmanGozlemcisi gozlemci) {
        // Garson departmanı için gözlemciye ihtiyaç yok
    }

    public void removeObserver(DepartmanGozlemcisi gozlemci) {
        // Garson departmanı için gözlemciye ihtiyaç yok
    }

    public void notifyObservers(Siparis siparis) {
        // Garson departmanı için gözlemciye ihtiyaç yok
    }
}
