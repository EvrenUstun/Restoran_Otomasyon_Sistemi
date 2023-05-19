import java.util.ArrayList;
import java.util.List;

public class MutfakDepartmani implements Department {
    private Department sonrakiDepartman;
    private List<DepartmanGozlemcisi> gozlemciler;

    public MutfakDepartmani() {
        gozlemciler = new ArrayList<>();
    }

    @Override
    public void siparisAl(Siparis siparis) {

    }

    public void siparisiIsle(Siparis siparis) {
        if (siparis.getAd().equals("Pizza")) {
            System.out.println("Mutfak Departmanı: " + siparis.getAd() + " siparişini aldı ve hazırladı.");
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
        gozlemciler.add(gozlemci);
    }

    public void removeObserver(DepartmanGozlemcisi gozlemci) {
        gozlemciler.remove(gozlemci);
    }

    public void notifyObservers(Siparis siparis) {
        for (DepartmanGozlemcisi gozlemci : gozlemciler) {
            gozlemci.update(siparis);
        }
    }
}
