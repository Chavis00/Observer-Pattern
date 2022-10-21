package ar.edu.undef.fie;


import java.util.ArrayList;
import java.util.List;

public class Empresa implements Subject {
    private List<Observer> suscriptores;
    private String nombre;
    private List<Trabajo> trabajos;
    private List<Usuario> trabajadores;

    public Empresa(String nombre) {
        suscriptores = new ArrayList<Observer>();
        trabajadores = new ArrayList<Usuario>();
        trabajos = new ArrayList<Trabajo>();
        this.nombre = nombre;
    }

    public void registerObserver(Observer suscriptor) {
        suscriptores.add(suscriptor);
    }

    @Override
    public void removeObserver(Observer o) {
        this.suscriptores.remove(o);
    }

    @Override
    public void notifyObservers(Trabajo nuevoTrabajo) {
        for (Observer suscriptor : suscriptores) {
            suscriptor.update(nuevoTrabajo);
        }
    }

    @Override
    public void notifyObserversRm(Trabajo trabajo) {
        for (Observer suscriptor : suscriptores) {
            suscriptor.updateRm(trabajo);
        }
    }


    public void addTrabajo(Trabajo nuevoTrabajo){
        trabajos.add(nuevoTrabajo);
        notifyObservers(nuevoTrabajo);
    }
    public void contratar(Trabajo trabajo, Usuario usuario){
        trabajadores.add(usuario);
        trabajo.setOcupado(true);
        this.trabajos.remove(trabajo);
        removeObserver(usuario);
        notifyObserversRm(trabajo);

    }

}