public class OdemeDepartmani implements Department {
    private Department sonrakiDepartman;

    @Override
    public void siparisAl(Siparis siparis) {

    }

    public void siparisiIsle(Siparis siparis) {
        System.out.println("Ödeme Departmanı: " + siparis.getAd() + " siparişinin ödemesi alındı.");
    }

    public void setSonrakiDepartman(Department sonrakiDepartman) {
        this.sonrakiDepartman = sonrakiDepartman;
    }

    @Override
    public void addObserver(DepartmanGozlemcisi gozlemci) {

    }

    @Override
    public void removeObserver(DepartmanGozlemcisi gozlemci) {

    }

    @Override
    public void notifyObservers(Siparis siparis) {

    }
}
