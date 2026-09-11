public class CentroMensajeria {

    public void recibirMensaje(Mensaje m) {
        System.out.println(" NUEVO MENSAJE RECIBIDO");
        System.out.println("Remitente : " + m.getRemitente());


        String nivelPrioridad = (m.getPrioridad() == 1) ? " ALTA" :
                (m.getPrioridad() == 2) ? " MEDIA" : " BAJA";

        System.out.println("Prioridad : " + nivelPrioridad);
        System.out.println("Alerta    : " + m.getTexto());
        System.out.println("--------------------------------------------------");
    }
}