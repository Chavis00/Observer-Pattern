package ar.edu.undef.fie;


public class Usuario implements Observer {
    String username;
    String email;

    public Usuario(String username, String email) {
        this.username = username;
        this.email = email;
    }


    public void sendEmail(String msg){
        System.out.println(msg);
    }
    public void update(Trabajo nuevoTrabajo) {
        sendEmail("Hola " + this.username +", tenemos un nuevo trabajo que podria interesarte: "+nuevoTrabajo.getPuesto()+"\nCon los siguientes requisitos: "+nuevoTrabajo.getRequisitos());
    }
    public void updateRm(Trabajo trabajo){
        sendEmail("Estimado "+this.username+", lamentamos Informarle que el puesto para: "+trabajo.getPuesto()+" ya ha sido ocupado");
    }
}
