package ar.edu.undef.fie;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(Trabajo nuevoTrabajo);
    public void notifyObserversRm(Trabajo trabajo);
}