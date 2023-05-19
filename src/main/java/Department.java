public interface Department {
    void siparisAl(Siparis siparis);
    void siparisiIsle(Siparis siparis);
    void setSonrakiDepartman(Department sonrakiDepartman);
    void addObserver(DepartmanGozlemcisi gozlemci);
    void removeObserver(DepartmanGozlemcisi gozlemci);
    void notifyObservers(Siparis siparis);
}
