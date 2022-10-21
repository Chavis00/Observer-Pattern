package ar.edu.undef.fie;

public interface Observer {
    public void update(Trabajo nuevoTrabajo);
    public void updateRm(Trabajo trabajo);
}