package ar.edu.undef.fie;

public class Linkedim {
    public static void  main(String [] args){
        Empresa empresa = new Empresa("Microsoft");
        Usuario usuario1 = new Usuario("user1", "user1@gmail.com");
        Usuario usuario2 = new Usuario("user2", "user2@hotmail.com");
        Usuario usuario3 = new Usuario("user3", "user3@yahoo.com");

        System.out.println("Ningun usuario suscripto");

        Trabajo trabajo1 = new Trabajo("Ux Designer", "2 años de experiencia");
        Trabajo trabajo2 = new Trabajo("Backend Developer", "3 años de experiencia");
        Trabajo trabajo3 = new Trabajo("Frontend Developer", "4 años de experiencia");
        empresa.addTrabajo(trabajo1);
        System.out.println("------------------");
        empresa.registerObserver(usuario1);
        empresa.registerObserver(usuario2);
        empresa.registerObserver(usuario3);

        System.out.println("Todos los usuarios suscriptos");
        empresa.addTrabajo(trabajo2);
        System.out.println("------------------");
        System.out.println("Ocupando puesto de Backend con usuario1 ");
        empresa.contratar(trabajo2, usuario1);
        System.out.println("------------------");


        System.out.println("Solo usuario 2 suscripto");
        empresa.removeObserver(usuario1);
        empresa.removeObserver(usuario3);
        empresa.addTrabajo(trabajo3);
        System.out.println("------------------");



    }
}
