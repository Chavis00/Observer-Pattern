package ar.edu.undef.fie;

public class Trabajo {
    private String puesto;
    private Boolean ocupado;
    private String requisitos;

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public Trabajo(String puesto, String requisitos){
        this.puesto = puesto;
        this.requisitos = requisitos;
        this.ocupado = false;
    }

    public String getPuesto() {
        return puesto;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public String getRequisitos() {
        return requisitos;
    }
}
